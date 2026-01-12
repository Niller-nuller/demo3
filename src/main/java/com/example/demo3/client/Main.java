package com.example.demo3.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
      @Override
      public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainMenu.fxml"));
        Parent root = fxmlLoader.load();
        Scene mainMenuScene = new Scene(root);
        Scene mainMenu = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Main Menu!");
        stage.setScene(mainMenu);
        stage.show();
     }
}
