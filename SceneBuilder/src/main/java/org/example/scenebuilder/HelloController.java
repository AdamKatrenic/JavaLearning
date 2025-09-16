package org.example.scenebuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Button label;

    @FXML
    public void handleAction() {
        label.setText("OK Button Pressed");
    }
}
