package com.example.demo3.models;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static final int Max_Slots = 192;
    private static final double Max_Weight = 50.00;

    private double inventoryWeight = 0;

    private final ArrayList<Slots> inventorySlots = new ArrayList<>();

    public Inventory() {}

    public boolean addItem(Item item) {
        if (inventoryWeight + item.getWeight() > Max_Weight){
            return false;
        }
        for(Slots slot : inventorySlots) {
            if (slot.canAddItem(item)){
                slot.addItem(item);
                inventoryWeight += item.getWeight();
                return true;
            }
        }
    }
    public List<Slots> getInventorySlots() {
        return inventorySlots;
    }
    public double getInventoryWeight() {
        return inventoryWeight;
    }
    public int getUsedSlots(){
        return (int) inventorySlots.stream().filter(s -> !s.isEmpty()).count();
    }
}
