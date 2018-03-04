/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seankeever
 */
public class Group implements Movable {
    
    private List<Movable> group = new ArrayList<Movable>();
    
    
    public String toString() {
        String items = "";
        for (Movable i : group) {
            items += i + "\n";
        }
        return items;
    }
    
    public void addToGroup(Movable movable) {
        group.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable i : group) {
            i.move(dx, dy);
        }
        
    }
    
    
    
}
