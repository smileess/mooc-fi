/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import wormgame.Direction;

/**
 *
 * @author seankeever
 */
public class Worm {

    private List<Piece> pieces;
    private Direction direction;
    private boolean ableToGrow;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.direction = originalDirection;
        this.pieces = new ArrayList<Piece>();
        this.pieces.add(new Piece(originalX, originalY));
        this.ableToGrow = true;

    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getLength() {
        return pieces.size();
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void move() {

        if (direction == Direction.LEFT) {
            this.pieces.add(new Piece(pieces.get(pieces.size() - 1).getX() - 1, pieces.get(pieces.size() - 1).getY()));

        } else if (direction == Direction.RIGHT) {
            this.pieces.add(new Piece(pieces.get(pieces.size() - 1).getX() + 1, pieces.get(pieces.size() - 1).getY()));

        } else if (direction == Direction.DOWN) {
            this.pieces.add(new Piece(pieces.get(pieces.size() - 1).getX(), pieces.get(pieces.size() - 1).getY() + 1));

        } else if (direction == Direction.UP) {
            this.pieces.add(new Piece(pieces.get(pieces.size() - 1).getX(), pieces.get(pieces.size() - 1).getY() - 1));
        }
        
        if (pieces.size() <= 3) {
            ableToGrow = true;
        }

        if (!ableToGrow) {
            this.pieces.remove(0);
        }
        
        ableToGrow = false;

    }

    public void grow() {
        
        ableToGrow = true;

    }

    public boolean runsInto(Piece piece) {
        for (Piece p : pieces) {
            if (p.runsInto(piece)) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        Set<Piece> pieceSet = new HashSet<Piece>();
        pieceSet.addAll(pieces);
        return (pieceSet.size() < pieces.size());
    }

}
