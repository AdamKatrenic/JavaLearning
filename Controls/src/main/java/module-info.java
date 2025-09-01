module org.example.controls {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.controls to javafx.fxml;
    exports org.example.controls;
}