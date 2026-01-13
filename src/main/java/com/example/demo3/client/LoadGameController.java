package com.example.demo3.client;

import com.example.demo3.service_logic.Service_Logic;
import javafx.scene.control.Label;

public class LoadGameController {
    private Service_Logic service;
    private SceneController sceneController;
    private Label labelLoadGame;

    public void setService(Service_Logic service) {
        this.service = service;
    }

    public void setSceneController(SceneController sceneController) {
        this.sceneController = sceneController;
    }

}
