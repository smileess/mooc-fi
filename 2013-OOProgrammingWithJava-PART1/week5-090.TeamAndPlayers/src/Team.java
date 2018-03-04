/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */

import java.util.ArrayList;

public class Team {
    
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String teamName) {
        this.name = teamName;
        this.players = new ArrayList<Player>();
        this.maxSize = 0;
    
    }
    

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player person) {
        if (this.maxSize > this.players.size() || this.maxSize == 0) {
            this.players.add(person);
        
        }
    }
    
    public void printPlayers() {
        for (Player person : this.players) {
            System.out.println(person);

        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.players.size();
    }
    
    public int goals() {
        
        int totalGoals = 0;
        
        for (Player person : this.players) {
            totalGoals += person.getGoals();
            
        }
        return totalGoals;
    }
    
    
    
}
