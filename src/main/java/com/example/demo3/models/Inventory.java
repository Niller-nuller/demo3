package com.example.demo3.models;

import java.util.*;

public class Inventory {
    private int Current_Available_Slots = 32;
    private final int Max_Slots = 192;
    private final double Max_Weight = 50.00;
    private double inventoryWeight = 0;

    private final ArrayList<Slots> inventorySlots = new ArrayList<>();

    public Inventory() {
        for (int i = 0; i < getCurrentSlots(); i++) {
            inventorySlots.add(new Slots());
        }
    }
    public boolean addItem(Item itemToAdd){
        if (inventoryWeight + itemToAdd.getWeight() > getMaxWeight()) {
            return false;
        }
        if(itemToAdd instanceof Consumable consumable && consumable.isStackable())
        for(Slots slot : inventorySlots){
            if (!slot.isEmpty() && slot.canAddItem(itemToAdd)){
                List<Consumable> stack = slot.getConsumableStack();
                if(!stack.isEmpty() && stack.get(0).getName().equals(consumable.getName())) {
                    slot.addItem(itemToAdd);
                    inventoryWeight += itemToAdd.getWeight();
                    return true;
                }
            }
        }
        for(Slots slot : inventorySlots){
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
            if (slot.removeItem(itemToRemove)){
                inventoryWeight -= itemToRemove.getWeight();
                return true;
            }
        }
        return false;
    }
    public Consumable useConsumable(String consumableName){
        for(Slots slot : inventorySlots){
            List<Consumable> stack = slot.getConsumableStack();
            if(!stack.isEmpty() && stack.get(0).getName().equals(consumableName)){
                Consumable consumed = slot.removeOneConsumable();
                if(consumed != null){
                    inventoryWeight -= consumed.getWeight();
                }
                return consumed;
            }
        }
        return null;
    }
    public boolean hasSpaceFor(Item item) {
        return inventoryWeight + item.getWeight() <= Max_Weight;
    }

    public Slots getSlot(int index){
        if(index < 0 || index >= inventorySlots.size()){
            throw new IndexOutOfBoundsException();
        }
        return inventorySlots.get(index);
    }
    public List<Slots> getInventorySlots() {
        return Collections.unmodifiableList(inventorySlots);
    }
    public int getConsumableStackCount(){
        int count = 0;
        for (Slots slot : inventorySlots) {
            List<Consumable> stack = slot.getConsumalbeStack();
            if(!stack.isEmpty() && stack.get(0).getname().equls(consumableName)){
                count += stack.size();
            }
        }
        return count;
    }
    public double getInventoryWeight() {
        return inventoryWeight;
    }
    public int getUsedSlots(){
        return (int) inventorySlots.stream().filter(s -> !s.isEmpty()).count();
    }
    public int getMaxSlots(){
        return Max_Slots;
    }
    public int getCurrentSlots(){
        return Current_Available_Slots;
    }
    public void setCurrentSlots(){
        Current_Available_Slots++;
    }
    public double getMaxWeight(){
        return Max_Weight;
    }

}
