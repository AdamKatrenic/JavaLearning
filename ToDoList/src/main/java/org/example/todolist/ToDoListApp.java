package org.example.todolist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.todolist.datamodel.TodoData;

import java.io.IOException;

public class ToDoListApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ToDoListApp.class.getResource("MainWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 500);
        stage.setTitle("ToDoList!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void stop() throws Exception {
        try {
            TodoData.getInstance().storeToDoItems();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void init() throws Exception {
        try {
            TodoData.getInstance().loadToDoItems();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
