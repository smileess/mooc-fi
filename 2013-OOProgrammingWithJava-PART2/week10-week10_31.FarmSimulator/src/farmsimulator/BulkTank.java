/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author seankeever
 */
public class BulkTank {
    
    private final double capacity;
    private double volume = 0.0;

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public BulkTank() {
        this(2000);
    }

    public double getCapacity() {
        return capacity;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public double howMuchFreeSpace() {
        return capacity - volume;
    }
    
    public void addToTank(double amount) {
        if (amount > 0) {
            if (amount + volume >= capacity) {
                volume = capacity;
            } else {
                volume += amount;
            }
        }
    }
    
    public double getFromTank(double amount) {
        if (amount < 0) {
            return 0;
        }
        if (amount >= volume) {
            amount = volume;
            volume = 0;
            return amount;
        }
        volume -= amount;
        return amount;
    }
    
    @Override
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
    

    
}
