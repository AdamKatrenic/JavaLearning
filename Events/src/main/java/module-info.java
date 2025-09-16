module org.example.events {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.events to javafx.fxml;
    exports org.example.events;
}