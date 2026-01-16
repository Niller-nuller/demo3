package com.example.demo3.client;

import com.example.demo3.models.Player;
import com.example.demo3.service_logic.Service_Logic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class NewGameController {
    private Service_Logic service;
    private SceneController sceneController;


    public void setService(Service_Logic service) {
        this.service = service;}

    public void setSceneController(SceneController sceneController) {
        this.sceneController = sceneController;}
    @FXML
    private Label newGameLabel;

    @FXML
    private TextField playerNameField;
    @FXML
    public void onClickBackToMainMenu(ActionEvent event) throws IOException {
        sceneController.switchToMainMenu(event,service);
    }
    @FXML
    public void onCreateCharacter(ActionEvent event) throws IOException {
        String name = playerNameField.getText().trim();
        if (name.isEmpty()) {
            newGameLabel.setText("Please enter a name for your character");
            return;
        }

        Player created = service.createPlayer(name);
        if (created != null) {
            service.setCurrentPlayer(created);
            newGameLabel.setText("Created: " + name);
            sceneController.switchToGameScene(event, service);
        } else {
            newGameLabel.setText("Name is already in use: " + name);
        }
    }
}
