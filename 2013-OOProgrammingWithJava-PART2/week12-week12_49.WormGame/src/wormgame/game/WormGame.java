package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private Worm worm;
    private Apple apple;
    private Random random = new Random();
    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.worm = new Worm(this.width / 2, this.height / 2, Direction.DOWN);
        this.apple = new Apple(random.nextInt(this.width), random.nextInt(this.height));

        checkRandomApple();

        addActionListener(this);
        setInitialDelay(2000);

    }

    public Worm getWorm() {
        return worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
        checkRandomApple();

    }

    private void checkRandomApple() {

        while (true) {
            for (Piece piece : worm.getPieces()) {
                if (piece.runsInto(apple)) {
                    apple = new Apple(random.nextInt(this.width), random.nextInt(this.height));
                    checkRandomApple();
                }
            }
            break;
        }

    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (!continues) {
            return;
        }

        worm.move();
        
        if (worm.runsInto(apple)) {
            worm.grow();
            setApple(new Apple(random.nextInt(width), random.nextInt(height)));

        } else if (worm.runsIntoItself()) {
            continues = false;
        }
        
        updatable.update();
        
        super.setDelay(1000 / worm.getLength());
        
        checkBorders();
        

    }
    
    private void checkBorders() {
        
        List<Piece> wormPieces = worm.getPieces();
        
        int wormX = wormPieces.get(wormPieces.size() - 1).getX();
        int wormY = wormPieces.get(wormPieces.size() - 1).getY();
        
        if (wormX < 0 || wormX >= width || wormY < 0 || wormY >= height) {
            continues = false;
        }
       
    }

}
