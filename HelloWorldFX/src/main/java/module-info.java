module org.example.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens org.example.helloworldfx to javafx.fxml;
    exports org.example.helloworldfx;
}