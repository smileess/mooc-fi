/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
public class Player {
    
    private String name;
    private int goals;
    
    public Player (String nameOfPlayer, int numberOfGoals) {
        this.name = nameOfPlayer;
        this.goals = numberOfGoals;
    }
    
    public Player (String nameOfPlayer) {
        this(nameOfPlayer, 0);
    }

    @Override
    public String toString() {
        return this.name + ", goals " + this.goals;
    }
    
    public int getGoals() {
        return this.goals;
    }

    public String getName() {
        return name;
    }
    
    public int goals() {
        return goals;
    }
    
    
    
}
