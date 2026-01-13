package com.example.demo3.models;

public class Weapon extends Item {
    private final int damage;

    public Weapon(String name, double weight, int damage){
        super(name,weight);
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }

}
