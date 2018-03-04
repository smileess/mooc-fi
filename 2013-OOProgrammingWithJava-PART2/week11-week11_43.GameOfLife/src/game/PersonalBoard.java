/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author seankeever
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        Random random = new Random();

        for (int i = 0; i < super.getWidth(); i++) {
            for (int j = 0; j < super.getHeight(); j++) {
                double probability = random.nextDouble();
                if (probability <= d) {
                    turnToLiving(i, j);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if (inBounds(i, i1)) {
            return getBoard()[i][i1];
        }
        return false;
    }

    public boolean inBounds(int i, int i1) {

        if (i < super.getWidth() && i >= 0
                && i1 < super.getHeight() && i1 >= 0) {
            return true;
        }
        return false;

    }

    @Override
    public void turnToLiving(int i, int i1) {
        if (inBounds(i, i1)) {
            getBoard()[i][i1] = true;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        if (inBounds(i, i1)) {
            getBoard()[i][i1] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int count = 0;
        for (int rows = x - 1; rows <= x + 1; rows++) {
            for (int columns = y - 1; columns <= y + 1; columns++) {
                if (rows != x || columns != y) {
                    if (isAlive(rows, columns)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbors) {
        if (livingNeighbors < 2 || livingNeighbors > 3) {
            turnToDead(x, y);
            
        } else if (livingNeighbors == 3) {
            turnToLiving(x, y);
        } 
    }
}
