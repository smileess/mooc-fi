/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author seankeever
 */
public class ProductContainerRecorder extends ProductContainer {
    
    private ContainerHistory handler = new ContainerHistory();
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        handler.add(initialVolume);
    }
    
    public String history() {
        return handler.toString();
    }
    
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        handler.add(super.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        double amountTaken = super.takeFromTheContainer(amount);
        handler.add(super.getVolume());
        return amountTaken;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Greatest product amount: " + handler.maxValue());
        System.out.println("Smallest product amount: " + handler.minValue());
        System.out.println("Average: " + handler.average());
        System.out.println("Greatest change: " + handler.greatestFluctuation());
        System.out.println("Variance: " + handler.variance());
        
        
    }
    
}
