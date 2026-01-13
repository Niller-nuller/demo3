package com.example.demo3.client;

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
        sceneController.switchToMainMenu(event);
    }
    @FXML
    public void onCreateCharacter() throws IOException {
        if(playerNameField.getText().isEmpty()){
            newGameLabel.setText("You need to enter a name. To create a new character.");
        }
        String playerName = playerNameField.getText();
        service.createPlayer(playerName);
    }

}
