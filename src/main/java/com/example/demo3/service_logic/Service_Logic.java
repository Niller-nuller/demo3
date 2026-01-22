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
        return players.stream()
                .filter(player -> Objects.equals(player.getName(), name))
                .findFirst().orElse(null);
    }
    public ArrayList<Player> getPlayers(){
        return players;
    }

    public void addItem(Item newItem){
        currentPlayer.getPlayerInventory().addItem(newItem);

    }
    public void removeItem(Item newItem){
        currentPlayer.getPlayerInventory().removeItem(newItem);
    }

    public void setCurrentPlayer(Player player){
        currentPlayer = Objects.requireNonNull(player);
    }
    public Player getCurrentPlayer(){
        return Objects.requireNonNull(currentPlayer);
    }


}
