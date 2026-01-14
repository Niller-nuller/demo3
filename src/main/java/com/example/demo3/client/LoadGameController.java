package com.example.demo3.client;

import com.example.demo3.models.Player;
import com.example.demo3.service_logic.Service_Logic;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.collections.ObservableList;

import java.io.IOException;

public class LoadGameController {
    private Service_Logic service;
    private SceneController sceneController;

    @FXML
    private Label labelLoadGame;

    @FXML
    private ListView<Player> playerListView;
    @FXML
    private void initialize(){
        populatePlayerList();}

    public void setService(Service_Logic service) {
        this.service = service;
    }

    public void setSceneController(SceneController sceneController) {
        this.sceneController = sceneController;
    }

    @FXML
    public void onClickBackToMainMenu(ActionEvent event) throws IOException {
        sceneController.switchToMainMenu(event);
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

    @FXML
    public void onClickLoadGame(ActionEvent event) throws IOException {
        Player selected = playerListView.getSelectionModel().getSelectedItem();
        if (selected == null) {
            labelLoadGame.setText("Please select a player");
            return;
        }

        service.setCurrentPlayer(selected);
        labelLoadGame.setText("Loaded: " + selected.getName());
        sceneController.switchToGameScene(event, service);
    }
}