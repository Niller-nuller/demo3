package com.example.demo3.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Slots {

    private Item singleItem;
    private final ArrayList<Item> playerItems = new ArrayList<>();

    public Slots() {}

    public boolean canAddItem(Item itemToAdd) {
        if(isEmpty()){
            return true;
        }
        if(itemToAdd instanceof Consumable consumable && consumable.isStackable()){
            if (singleItem != null){
                return false;
            }
            if (consumableStack.isEmpty()){
                return true;
            }

        }
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
