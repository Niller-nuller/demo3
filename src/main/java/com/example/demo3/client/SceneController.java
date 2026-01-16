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

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    private void showScene(ActionEvent event, Parent root) {
        if(stage == null){
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        }
        Scene scene = stage.getScene();
        if(scene == null){
            scene = new Scene(root);
        } else {
            scene.setRoot(root);
        }
        stage.setScene(scene);
        stage.show();
    }
    public void switchToMainMenu(javafx.event.ActionEvent event, Service_Logic service ) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo3/MainMenu.fxml"));
        Parent root = loader.load();
        MainMenuController controller = loader.getController();
        controller.setService(service);
        controller.setSceneController(this);
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

}
