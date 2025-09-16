module org.example.mojekontakty {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml; // <- pridaj toto

    opens org.example.mojekontakty to javafx.fxml;
    opens org.example.mojekontakty.datamodel to javafx.base;
    exports org.example.mojekontakty;
    exports org.example.mojekontakty.datamodel;
}