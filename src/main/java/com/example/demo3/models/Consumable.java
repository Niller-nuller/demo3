package com.example.demo3.models;

public class Consumable extends Item {

    private final boolean stackable;

    public Consumable(String name, double weight, boolean stackable) {
        super(name,  weight);
        this.stackable = stackable;
    }
    public boolean getIsStackable() {
        return stackable;
    }
}
