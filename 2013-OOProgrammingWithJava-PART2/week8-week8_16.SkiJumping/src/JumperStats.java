
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seankeever
 */
public class JumperStats implements Comparable<JumperStats> {

    private String name;
    private Random random = new Random();
    private int points = 0;
    private ArrayList<Integer> lengths = new ArrayList<Integer>();
    private ArrayList<Integer> judges = new ArrayList<Integer>();

    public JumperStats(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // will need this when we print the tournament results
    public String getLengths() {
        String string = "";
        String extraString = " m, ";
        for (int i = 0; i < lengths.size(); i++) {
            if (i == lengths.size() - 1) {
                extraString = " m";
            }
            string += lengths.get(i) + extraString;

        }
        return string;
    }

    // will also needs this when we print the tournament results
    public int getPoints() {
        return points;
    }

    // will clear any existing judge results, and create a new set of results
    // we will then apply the set to the jumper's points and return the full list.
    // will need this for the results of each round
    public ArrayList<Integer> getNewJudgeResults() {
        judges.clear();
        for (int i = 0; i < 5; i++) {
            judges.add(getRandom(10, 20));
        }
        applyJudgeResults();
        return judges;

    }

    // removes the smallest and largest value in the judges results
    // then adds the remaining values to the jumpers points
    public void applyJudgeResults() {
        Collections.sort(judges);
        for (int i = 1; i < judges.size() - 1; i++) {
            points += judges.get(i);
        }
    }

    // will use this for each new round produced, it will also be
    // used when we display the length in the user interface
    public int getNewLength() {
        int lengthPoints = getRandom(60, 120);
        points += lengthPoints;
        lengths.add(lengthPoints);
        return lengthPoints;

    }

    // allows us to set a lower and upper bound and return a random 
    // integer
    public int getRandom(int lowerBound, int upperBound) {
        while (true) {
            int number = random.nextInt(upperBound);
            if (number >= lowerBound) {
                return number;
            }
        }
    }

    public int compareTo(JumperStats other) {
        return points - other.points;
    }

    public String toString() {
        return name + " (" + points + " points)";
    }

}
