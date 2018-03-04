/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

/**
 *
 * @author seankeever
 */
public class DrawingBoard extends JPanel implements Updatable {
    
    private WormGame wormGame;
    private int piecesLength;

    public DrawingBoard(WormGame wormGame, int piecesLength) {
        this.wormGame = wormGame;
        this.piecesLength = piecesLength;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Worm worm = wormGame.getWorm();
        
        for (Piece piece : worm.getPieces()) {
            g.setColor(Color.BLACK);
            g.fill3DRect(piece.getX() * piecesLength, piece.getY() * piecesLength, piecesLength, piecesLength, true);
            
        }
        
        Apple apple = wormGame.getApple();
        
        g.setColor(Color.red);
        g.fillOval(apple.getX() * piecesLength, apple.getY() * piecesLength, piecesLength, piecesLength);
        
        
        update();
        
    }

    @Override
    public void update() {
        super.repaint();
    }
   
}
