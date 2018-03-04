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
public class OneThingBox extends Box {
    
    private List<Thing> box;

    public OneThingBox() {
        this.box = new ArrayList<Thing>();
    }
    
    
    
    @Override
    public void add(Thing thing) {

        if (box.isEmpty()) {
            this.box.add(thing);

        }

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        
        if (box.isEmpty()) {
            return false;
        }
        
        Thing itemInBox = box.get(0);
        if (itemInBox.equals(thing)) {
            return true;
        }
        
        return false;
        

    }
    
}
