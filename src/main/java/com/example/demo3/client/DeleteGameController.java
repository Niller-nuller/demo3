package com.example.demo3.client;

import com.example.demo3.models.Player;
import com.example.demo3.service_logic.Service_Logic;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

import java.io.IOException;

public class DeleteGameController {

    private Service_Logic service;
    private SceneController sceneController;

    @FXML
    private Label labelDeleteGame;

    @FXML
    private ListView<Player> playerListView;

    @FXML
    public void initialize(){
        populatePlayerList();
    }
    public void setService(Service_Logic service) {
        this.service = service;
    }
    public void setSceneController(SceneController sceneController) {
        this.sceneController = sceneController;
    }
    @FXML
    private void populatePlayerList() {
        ObservableList<Player> playerObservableList = FXCollections.observableArrayList(service.getPlayers());
        playerListView.setItems(playerObservableList);
        playerListView.setCellFactory(lv -> new ListCell<Player>() {
            @Override protected void updateItem(Player player, boolean empty) {
                super.updateItem(player, empty);
                setText(empty ? null : player.getName());
            }
        });
    }
    private void onClickBackToMainMenu(ActionEvent event) throws IOException {
        sceneController.switchToMainMenu(event);
    }
}

