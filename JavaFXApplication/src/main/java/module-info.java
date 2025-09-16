module org.example.javafxapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.javafxapplication to javafx.fxml;
    exports org.example.javafxapplication;
}