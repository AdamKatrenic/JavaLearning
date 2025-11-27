import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;

public class ChatClientFX extends Application {

    private TextArea chatArea;
    private TextField inputField;
    private PrintWriter out;

    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12346;

    @Override
    public void start(Stage primaryStage) {
        // --- GUI komponenty ---
        chatArea = new TextArea();
        chatArea.setEditable(false); // len na čítanie

        inputField = new TextField();
        Button sendButton = new Button("Send");

        // Layout pre spodnú časť (input + button)
        HBox bottomBox = new HBox(10, inputField, sendButton);

        BorderPane root = new BorderPane();
        root.setCenter(chatArea);
        root.setBottom(bottomBox);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("JavaFX Chat Client");
        primaryStage.setScene(scene);
        primaryStage.show();

        // --- Pripojenie k serveru ---
        connectToServer();

        // --- Odosielanie správ ---
        sendButton.setOnAction(e -> sendMessage());
        inputField.setOnAction(e -> sendMessage()); // Enter kláves
    }

    private void connectToServer() {
        try {
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Vlákno na prijímanie správ
            new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = in.readLine()) != null) {
                        String finalMessage = serverMessage;
                        Platform.runLater(() -> chatArea.appendText(finalMessage + "\n"));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage() {
        String message = inputField.getText();
        if (!message.isEmpty()) {
            out.println(message);
            inputField.clear();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
