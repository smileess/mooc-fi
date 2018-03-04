/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seankeever
 */
public class MaxWeightBox extends Box {
    
    private int maxWeight;
    private List<Thing> things = new ArrayList<Thing>();

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    private int getWeight() {
        
        int weight = 0;
        
        if (things.isEmpty()) {
            return weight;
        }

        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    @Override
    public void add(Thing thing) {
        if (thing.getWeight() + getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing item : things) {
            if (thing.equals(item)) {
                return true;
            }
        }
        return false;
    }
    
}
