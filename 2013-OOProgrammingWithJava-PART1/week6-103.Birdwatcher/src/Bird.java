/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int observation;
    
    public Bird(String name, String latinName, int observation) {
        
        this.name = name;
        this.latinName = latinName;
        this.observation = observation;
        
    }
    
    public Bird(String name, String latinName) {
        
        this(name, latinName, 0);
        
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservation() {
        return observation;
    }
    
    

    public void addObservation() {
        this.observation++;
    }

    @Override
    public String toString() {
        return name + " (" + latinName + "): " + observation + " observations";
    }
    
    
    
    
    
    
    
}
