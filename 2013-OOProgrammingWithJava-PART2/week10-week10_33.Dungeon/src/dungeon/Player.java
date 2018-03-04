/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author seankeever
 */
public class Player extends Person {
    
    public Player(int xBound, int yBound) {
        this.point.setBounds(xBound, yBound);
        this.point.setPoint(0, 0);
    }
    

    @Override
    public String toString() {
        return "@ " + this.point;
    }
    
    
}
