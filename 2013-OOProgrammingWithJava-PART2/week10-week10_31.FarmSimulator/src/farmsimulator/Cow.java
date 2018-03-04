/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author seankeever
 */
public class Cow implements Milkable, Alive {

    private Random random = new Random();
    private String name;
    private double amount;
    private double capacity = 15 + random.nextInt(26);
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(String name) {
        this.name = name;
    }

    public Cow() {
        this.name = NAMES[random.nextInt(NAMES.length)];
        // get random name
    }
    
    

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return capacity;

    }

    public double getAmount() {
        return amount;
    }
    


    @Override
    public String toString() {
        return name + " " + Math.ceil(amount) + "/" + Math.ceil(capacity);
    }
    
    @Override
    public double milk() {
        double toBeReturned = amount;
        amount = 0;
        return toBeReturned;
    }

    @Override
    public void liveHour() {
        double randomValue = 0.7 + (2.0 - 0.7) * random.nextDouble();
        if (amount + randomValue >= capacity) {
            amount = capacity;
        } else {
            amount += randomValue;
        }
        
    }

}
