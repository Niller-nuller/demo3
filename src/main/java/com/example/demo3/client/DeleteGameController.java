package com.example.demo3.client;

import com.example.demo3.service_logic.Service_Logic;

public class DeleteGameController {

    private Service_Logic service;
    private SceneController sceneController;

    public void setService(Service_Logic service) {
        this.service = service;
    }
    public void setSceneController(SceneController sceneController) {
        this.sceneController = sceneController;
    }
}

