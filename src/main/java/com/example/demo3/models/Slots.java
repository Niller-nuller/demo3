package com.example.demo3.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Slots {

    private static final int max_Item_Per_Stack = 5;
    private final ArrayList<Item> playerItems = new ArrayList<>();

    public Slots() {}

    public boolean canAddItem(Item itemToAdd) {

        if (itemToAdd instanceof Consumable newConsumable && newConsumable.isStackable()) {
            long sameTypeCount = playerItems.stream()
                    .filter(item -> item instanceof Consumable)
                    .map(item -> (Consumable) item)
                    .filter(c -> c.isStackable()
                    && c.getName().equals(itemToAdd.getName()))
                    .count();

            if (sameTypeCount >= newConsumable.getMaxStackSize()) {
                return false;
            }
        }
        return playerItems.size() < max_Item_Per_Stack;
    }
    public void addItem(Item itemToAdd) {
        if(!canAddItem(itemToAdd)) {
            throw new IllegalArgumentException("Cannot add item to this slot.");
        }
        playerItems.add(itemToAdd);
    }
    public boolean removeItem(Item itemToRemove) {
        return playerItems.remove(itemToRemove);
    }
    public Item removeItem(int index){
        if(index < 0 || index >= playerItems.size()) {
            throw new IllegalArgumentException("Invalid slot index: " + index);
        }
        return playerItems.remove(index);
    }
    public boolean isEmpty() {
        return playerItems.isEmpty();
    }
    public List<Item> getPlayerItems() {
        return Collections.unmodifiableList(playerItems);
    }

}
