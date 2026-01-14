package com.example.demo3.models;

import java.util.ArrayList;

public class Slots {

    private static final int max_Item_Per_Stack = 5;
    private final ArrayList<Item> playerItems = new ArrayList<>();

    public Slots() {}

    public boolean canAddItem(Item newItem) {

        if (newItem instanceof Consumable newConsumable && newConsumable.isStackable()) {
            long sameTypeCount = playerItems.stream()
                    .filter(item -> item instanceof Consumable)
                    .map(item -> (Consumable) item)
                    .filter(c -> c.isStackable()
                    && c.getName().equals(newItem.getName()))
                    .count();

            if (sameTypeCount >= newConsumable.getMaxStackSize()) {
                return false;
            }
        }
        return playerItems.size() < max_Item_Per_Stack;
    }
    public void addItem(Item newItem) {

    }
    public boolean isEmpty() {
        return playerItems.isEmpty();
    }

}
