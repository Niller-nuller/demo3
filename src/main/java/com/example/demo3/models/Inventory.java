package com.example.demo3.models;

import java.util.*;

public class Inventory {
    private static final int Max_Slots = 192;
    private static final double Max_Weight = 50.00;
    private double inventoryWeight = 0;

    private final ArrayList<Slots> inventorySlots = new ArrayList<>();

    public Inventory() {
        for (int i = 0; i < 32; i++) {
            inventorySlots.add(new Slots());
        }
    }
    public boolean addItem(Item itemToAdd){
        if (inventoryWeight + itemToAdd.getWeight() > Max_Weight) {
            return false;
        }
        for (Slots slot : inventorySlots) {
            if(slot.canAddItem(itemToAdd)){
                slot.addItem(itemToAdd);
                inventoryWeight += itemToAdd.getWeight();
                return true;
            }
        }
        return false;
    }
    public boolean removeItem(Item itemToRemove){
        for (Slots slot : inventorySlots) {
            if(slot.removeItem(itemToRemove)){
                inventoryWeight -= itemToRemove.getWeight();
                return true;
            }
        }
        return false;
    }

    public List<Slots> getInventorySlots() {
        return Collections.unmodifiableList(inventorySlots);
    }
    public double getInventoryWeight() {
        return inventoryWeight;
    }
    public int getUsedSlots(){
        return (int) inventorySlots.stream().filter(s -> !s.isEmpty()).count();
    }

    public boolean hasSpaceFor(Item item) {
        return inventoryWeight + item.getWeight() <= Max_Weight;
    }
}
