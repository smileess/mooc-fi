/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author seankeever
 */
public class Dungeon {

    private Scanner reader = new Scanner(System.in);
    private Point bounds;
    private Set<Vampire> vampires = new HashSet<Vampire>();
    private Set<Vampire> killed = new HashSet<Vampire>();
    private int moves;
    private boolean vampiresMove;
    private Player player;

    public Dungeon(int width, int height, int vampires, int moves, boolean vampiresMove) {

        this.bounds = new Point();
        this.bounds.setBounds(width, height);

        this.player = new Player(bounds.getxBound() - 1, bounds.getyBound() - 1);
        for (int i = 0; i < vampires; i++) {
            this.vampires.add(new Vampire(bounds.getxBound() - 1, bounds.getyBound() - 1));
        }
        this.moves = moves;
        this.vampiresMove = vampiresMove;

    }

    public void run() {
        while (moves > 0) {

            System.out.println(moves);
            System.out.println();

            System.out.println(player);
            for (Vampire vampire : vampires) {
                System.out.println(vampire);
            }

            System.out.println();

            // print map
            printMap();

            System.out.println();

            String input = reader.nextLine();
            controlPlayer(input);

            if (vampires.isEmpty()) {
                System.out.println("YOU WIN");
                break;
            }

            moves--;

        }
        if (!vampires.isEmpty()) {
            System.out.println("YOU LOSE");
        }

    }

    public void controlPlayer(String string) {
        for (char c : string.toCharArray()) {
            if (c == 'w') {
                // go up
                player.moveUp();
            } else if (c == 's') {
                // go down
                player.moveDown();
            } else if (c == 'a') {
                // go left
                player.moveLeft();
            } else if (c == 'd') {
                // go right
                player.moveRight();
            }

            checkForKills();
            moveVampires();

        }
    }

    private void moveVampires() {
        for (Vampire vampire : vampires) {
            if (vampiresMove) {
                checkVampireLocations(vampire);
            }
            
        }
    }

    private void checkVampireLocations(Vampire vampire) {
        Set<Point> vampireLocations = new HashSet<Point>();
        while (true) {
            vampire.randomMove();
            Point p = vampire.point.getPoint();
            if (!vampireLocations.contains(p)) {
                vampireLocations.add(p);
                break;
            }
        }
    }

    public void checkForKills() {
        for (Vampire vampire : vampires) {
            if (vampire.point.getPoint().equals(player.point.getPoint())) {
                killed.add(vampire);
            }

        }

        vampires.removeAll(killed);
    }

    private void printMap() {
        for (int y = 0; y < bounds.getyBound(); y++) {
            for (int x = 0; x < bounds.getxBound(); x++) {
                Point p = new Point();
                p.setPoint(x, y);
                String result = checkForPerson(p);
                System.out.print(result);
            }
            System.out.println();
        }
    }

    private String checkForPerson(Point point) {
        if (point.equals(player.point.getPoint())) {
            return "@";
        }

        for (Vampire vampire : vampires) {
            if (point.equals(vampire.point.getPoint())) {
                return "v";
            }
        }

        return ".";
    }

}
