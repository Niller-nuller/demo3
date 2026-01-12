package com.example.demo3.client;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;

public class MainMenuController {
    @FXML
    private Label welcomeText;

    @FXML
    private void exitButtonPressed(ActionEvent event) {
        Platform.exit();
    }
}
