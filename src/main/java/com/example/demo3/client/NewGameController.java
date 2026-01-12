package com.example.demo3.client;

import com.example.demo3.service_logic.Service_Logic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class NewGameController {
    private final Service_Logic service = new Service_Logic();
    private final SceneController sceneController = new SceneController();
    @FXML
    private Label newGameLabel;
    @FXML
    private TextField playerNameField;
    @FXML
    public void onClickBackToMainMenu() throws IOException {
        sceneController.switchToMainMenu(new ActionEvent());
    }
    @FXML
    public void onCreateCharacter(ActionEvent event) throws IOException {
        service.createPlayer(String.valueOf(playerNameField));
    }

}
