package com.example.demo3.models;

import com.example.demo3.models.Enums.ConsumableType;

public class Consumable extends Item {

    private final boolean stackable;
    private final int maxStackSize;
    private final ConsumableType consumableType;

    public Consumable(String name, double weight, boolean stackable, int maxStackSize,ConsumableType consumableType) {
        super(name,  weight);
        if(maxStackSize <= 0){
            throw new IllegalArgumentException("maxStackSize must be greater than 0");
        }
        this.stackable = stackable;
        this.maxStackSize = maxStackSize;
        this.consumableType = consumableType;
    }
    public Consumable(String name, double weight, ConsumableType consumableType) {
        super(name, weight);
        this.stackable = false;
        this.maxStackSize = 1;
        this.consumableType = consumableType;

    }
    public boolean isStackable() {
        return stackable;
    }
    public int getMaxStackSize() {
        return maxStackSize;
    }
    public ConsumableType getConsumableType() {
        return consumableType;
    }
}
