package com.example.demo3.client;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;

import java.io.IOException;

public class MainMenuController {
    private final SceneController sceneController = new SceneController();
    @FXML
    private Label welcomeText;

    @FXML
    public void onNewGameButtonPress(ActionEvent event) throws IOException {
        sceneController.switchToNewGame(new ActionEvent());
    }
    @FXML
    public void onLoadGameButtonPress(ActionEvent event) throws IOException {
        sceneController.switchToLoadGame(new ActionEvent());
    }
    @FXML
    public void onDeleteGameButtonPress(ActionEvent event) throws IOException {
        sceneController.switchToDeleteGame(new ActionEvent());
    }


    @FXML
    private void onExitButtonPressed(ActionEvent event) {
        Platform.exit();
    }
}
