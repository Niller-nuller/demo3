package com.example.demo3.client;

import com.example.demo3.service_logic.Service_Logic;

public class LoadGameController {
    private Service_Logic service;
    private final SceneController sceneController = new SceneController();

    public void setService(Service_Logic service) {
        this.service = service;
    }
}
