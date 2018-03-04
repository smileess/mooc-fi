/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seankeever
 */
public class Box implements Thing {
    
    private int maxCapacity;
    private List<Thing> items = new ArrayList<Thing>();

    public Box(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    
    public boolean addThing(Thing thing) {
        if (getVolume() + thing.getVolume() <= maxCapacity) {
            items.add(thing);
            return true;
            
        }
        return false;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing thing : items) {
            volume += thing.getVolume();
        }
        return volume;
    }
    
}
