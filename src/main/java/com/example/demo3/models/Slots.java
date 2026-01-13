package com.example.demo3.models;

import java.util.ArrayList;

public class Slots {

    private final ArrayList<Item> playerItems = new ArrayList<>();
    private static final int Max_Inventory_Size = 192;

    public Slots() {}

    public boolean canAddItem(Item newItem){
        if(items.size() >= 5) return false;

        for(Item e : playerItems){
            if(e.getName().equals(newItem.getName())){}
        }
    }
}
