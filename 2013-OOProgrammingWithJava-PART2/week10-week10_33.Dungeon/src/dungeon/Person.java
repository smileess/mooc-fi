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
public abstract class Person {

    protected Point point = new Point();

    public void moveUp() {
        if (point.getY() > 0) {
            this.point.setPoint(point.getX(), point.getY() - 1);
        }
    }

    public void moveDown() {
        if (point.getY() < point.getyBound()) {
            this.point.setPoint(point.getX(), point.getY() + 1);
        }
    }

    public void moveLeft() {
        if (point.getX() > 0) {
            this.point.setPoint(point.getX() - 1, point.getY());
        }
    }

    public void moveRight() {
        if (point.getX() < point.getxBound()) {
            this.point.setPoint(point.getX() + 1, point.getY());
        }
    }

}
