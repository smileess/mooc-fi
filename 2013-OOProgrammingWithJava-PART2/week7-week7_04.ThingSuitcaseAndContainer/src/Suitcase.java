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

public class Suitcase {
    
    private ArrayList<Thing> things;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
        
    }
    
    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
        
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }
    
    public Thing heaviestThing() {
        if (things.size() > 0) {
            Thing heaviestThing = things.get(0);
            for (Thing thing : things) {
                if (thing.getWeight() > heaviestThing.getWeight()) {
                    heaviestThing = thing;
                }
            }
            return heaviestThing;
        }
        return null;
     
    }
    
    @Override
    public String toString() {
        if (things.size() == 0) {
            return "empty" + restOfPhrase();
        }
        if (things.size() == 1) {
            return things.size() + " thing " + restOfPhrase();
        }
        return things.size() + " things " + restOfPhrase();
    }
    
    public String restOfPhrase() {
        return "(" + totalWeight() + " kg)";
    }
    
    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }
    
    
}
