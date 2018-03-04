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
public class Point implements Comparable<Point> {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.x;
        hash = 13 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Point other = (Point) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    private Random random = new Random();

    private int x = 0;
    private int y = 0;

    private int xBound;
    private int yBound;

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setBounds(int x, int y) {
        this.xBound = x;
        this.yBound = y;
    }

    public Point getPoint() {
        return this;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxBound() {
        return xBound;
    }

    public int getyBound() {
        return yBound;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x && this.y == o.y) {
            return 0;
        }
        return this.x - o.x;
    }
    
    
    
    



}
