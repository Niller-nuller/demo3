package com.example.demo3.client;

import com.example.demo3.service_logic.Service_Logic;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class SceneController {

    private Stage stage;
    private Scene scene;

    public void switchToMainMenu(javafx.event.ActionEvent event ) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo3/MainMenu.fxml"));
        Parent root = loader.load();
        showScene(event,root);
    }

    public void switchToNewGame(ActionEvent event, Service_Logic service ) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo3/NewGame.fxml"));
        Parent root = loader.load();
        NewGameController controller = loader.getController();
        controller.setService(service);
        controller.setSceneController(this);
        showScene(event,root);
    }
    public void switchToLoadGame(ActionEvent event, Service_Logic service ) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo3/LoadGame.fxml"));
        Parent root = loader.load();
        LoadGameController controller = loader.getController();
        controller.setService(service);
        controller.setSceneController(this);
        showScene(event,root);
    }
    public void switchToDeleteGame(ActionEvent event, Service_Logic service ) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo3/DeleteGame.fxml"));
        Parent root = loader.load();
        DeleteGameController controller = loader.getController();
        controller.setService(service);
        controller.setSceneController(this);
        showScene(event,root);
    }
    public void switchToGameScene(ActionEvent event, Service_Logic service) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo3/GameScene.fxml"));
        Parent root = loader.load();
        GameSceneController controller = loader.getController();
        controller.setService(service);
        controller.setSceneController(this);
        showScene(event,root);
    }
    private void showScene(ActionEvent event, Parent root) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
