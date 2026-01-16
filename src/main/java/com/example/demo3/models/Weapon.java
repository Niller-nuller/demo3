package com.example.demo3.models;

import com.example.demo3.models.Enums.WeaponType;

public class Weapon extends Item {
    private final int damage;
    private final WeaponType weaponType;

    public Weapon(String name, double weight, int damage, WeaponType weaponType){
        super(name,weight);
        this.damage = damage;
        this.weaponType = weaponType;
    }
    public int getDamage(){
        return damage;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
