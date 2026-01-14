package com.example.demo3.models;

public class Consumable extends Item {

    private final boolean stackable;
    private final int maxStackSize;

    public Consumable(String name, double weight, boolean stackable, int maxStackSize) {
        super(name,  weight);
        if(maxStackSize <= 0){
            throw new IllegalArgumentException("maxStackSize must be greater than 0");
        }
        this.stackable = stackable;
        this.maxStackSize = maxStackSize;
    }
    public Consumable(String name, double weight) {
        super(name, weight);
        this.stackable = false;
        this.maxStackSize = 1;

    }
    public boolean isStackable() {
        return stackable;
    }
    public int getMaxStackSize() {
        return maxStackSize;
    }
}
