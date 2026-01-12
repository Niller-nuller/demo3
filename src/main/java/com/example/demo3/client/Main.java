package com.example.demo3.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
      @Override
      public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/example/demo3/MainMenu.fxml"));
        Scene mainMenu = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Main Menu!");
        stage.setScene(mainMenu);
        stage.show();
     }
}
