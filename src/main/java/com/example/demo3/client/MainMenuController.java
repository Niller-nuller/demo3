package com.example.demo3.client;

import com.example.demo3.service_logic.Service_Logic;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MainMenuController {

    private Service_Logic service;
    private SceneController sceneController;

    public void setService(Service_Logic service) {
        this.service = service;
    }
    public void setSceneController(SceneController sceneController) {
        this.sceneController = sceneController;
    }
    @FXML
    public void onNewGameButtonPress(ActionEvent event) throws IOException {
        sceneController.switchToNewGame(event,service,sceneController);
    }
    @FXML
    public void onLoadGameButtonPress(ActionEvent event) throws IOException {
        sceneController.switchToLoadGame(event, service,sceneController);
    }
    @FXML
    public void onDeleteGameButtonPress(ActionEvent event) throws IOException {
        sceneController.switchToDeleteGame(event,service,sceneController);
    }
    @FXML
    private void onExitButtonPressed() {
        Platform.exit();
    }
}

