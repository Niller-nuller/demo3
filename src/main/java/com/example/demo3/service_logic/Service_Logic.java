package com.example.demo3.service_logic;

import com.example.demo3.models.Player;

import java.util.ArrayList;

public class Service_Logic {

    ArrayList<Player> players = new ArrayList<>();

    public Service_Logic(){}

    public Player createPlayer(String name){
        if(checkIfPlayerExists(name) != null){
            return null;
        }
        Player newPlayer = new Player(name);
        players.add(newPlayer);
        return newPlayer;
    }

    private Player checkIfPlayerExists(String name){
        for(Player p : players){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
}
