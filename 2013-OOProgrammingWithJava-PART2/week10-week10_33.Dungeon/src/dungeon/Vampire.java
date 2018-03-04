/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;

/**
 *
 * @author seankeever
 */
public class Vampire extends Person {
    
    private Random random = new Random();
    
    public Vampire(int xBound, int yBound) {
        this.point.setBounds(xBound, yBound);
        setRandomPosition();
        
    }

    public void setRandomPosition() {
        int randomX = 0;
        int randomY = 0;
                
        while (randomX == 0 && randomY == 0) {
            randomX = random.nextInt(this.point.getxBound());
            randomY = random.nextInt(this.point.getyBound());
        }
        
        this.point.setPoint(randomX, randomY);
    }
    
        public void randomMove() {
        if (random.nextBoolean()) {
            if (random.nextBoolean()) {
                moveUp();
            } else {
                moveDown();
            }
        } else {
            if (random.nextBoolean()) {
                moveLeft();
            } else {
                moveRight();
            }
        }
    }

    @Override
    public String toString() {
        return "v " + this.point;
    }

}
