package com.example.demo3.models;

import com.example.demo3.models.Enums.ArmorType;

public class Armor extends Item {

    private final int resistance;
    private final ArmorType armorType;

    public Armor(String name, double weight, int resistance, ArmorType armorType){
        super(name, weight);
        this.resistance = resistance;
        this.armorType = armorType;
    }
    public int getResistance() {
        return resistance;
    }

    public ArmorType getArmorType() {
        return armorType;
    }
}
