package com.example.demo3.client;

import com.example.demo3.service_logic.Service_Logic;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private final Service_Logic service = new Service_Logic();
    private final SceneController sceneController = new SceneController();
      @Override
      public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/example/demo3/MainMenu.fxml"));
        Scene mainMenu = new Scene(fxmlLoader.load(), 620, 540);
        MainMenuController controller = fxmlLoader.getController();
        controller.setService(service);
        controller.setSceneController(sceneController);
        stage.setTitle("Main Menu!");
        stage.setScene(mainMenu);
        stage.show();
     }
}
