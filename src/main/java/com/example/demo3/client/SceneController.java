package com.example.demo3.client;

import com.example.demo3.service_logic.Service_Logic;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Objects;

public class SceneController {

    private Stage stage;
    private Scene scene;

    public void switchToMainMenu(javafx.event.ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo3/MainMenu.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToNewGame(ActionEvent event, Service_Logic service, SceneController sceneController) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo3/NewGame.fxml"));
        switchScenes(event, service, loader, sceneController);
    }
    public void switchToLoadGame(ActionEvent event, Service_Logic service, SceneController sceneController) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo3/LoadGame.fxml"));
        switchScenes(event, service, loader, sceneController);
    }
    public void switchToDeleteGame(ActionEvent event, Service_Logic service, SceneController sceneController) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo3/DeleteGame.fxml"));
        switchScenes(event, service, loader, sceneController);
    }
    private void switchScenes(ActionEvent event, Service_Logic service, FXMLLoader loader,SceneController sceneController) throws IOException {
        Parent root = loader.load();
        NewGameController controller = loader.getController();
        controller.setService(service);
        controller.setSceneController(this);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
