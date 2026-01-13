package com.example.demo3.models;

public class Player {
    private final String name;
    private final Inventory playerInventory;

    public Player(String name ) {
        this.name = name;
        this.playerInventory = new Inventory();
    }
    public Inventory getPlayerInventory() {
        return playerInventory;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
