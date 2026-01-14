package com.example.demo3.service_logic;

import com.example.demo3.models.Item;
import com.example.demo3.models.Player;

import java.util.ArrayList;
import java.util.Objects;

public class Service_Logic {

    private Player currentPlayer;

    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Item> worldItems = new ArrayList<>();
    public Service_Logic(){}

    public Player createPlayer(String name){
        if(checkIfPlayerExists(name) != null){
            return null;
        }
        Player newPlayer = new Player(name);
        players.add(newPlayer);
        return newPlayer;
    }
    public boolean deletePlayer(Player player){
        return players.remove(player);
    }
    private Player checkIfPlayerExists(String name){
        for(Player p : players){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
    public ArrayList<Player> getPlayers(){
        return players;
    }

    public void addItem(Item newItem){

    }
    public void setCurrentPlayer(Player player){
        currentPlayer = Objects.requireNonNull(player);
    }
    public Player getCurrentPlayer(){
        return Objects.requireNonNull(currentPlayer);
    }
}
