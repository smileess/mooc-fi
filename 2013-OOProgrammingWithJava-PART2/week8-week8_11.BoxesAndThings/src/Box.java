
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
public class Box implements ToBeStored {
    
    private double maxWeight;
    private ArrayList<ToBeStored> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored item) {
        if (weight() + item.weight() <= maxWeight) {
            items.add(item);

        }
        
    }
    
    public double weight() {
        double weight = 0;
        for (ToBeStored item : items) {
            weight += item.weight();
        }
        return weight;
    }
    
    public String toString() {

        return "Box: " + items.size() + " things, total weight " + weight() + " kg";
    }
    
    
    
    
}
