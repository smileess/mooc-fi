/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */


public class Airplane {
    
    private String id;
    private String capacity;
    
    public Airplane(String id, String capacity) {
        this.id = id;
        this.capacity = capacity; 
    }

    public String getID() {
        return id;
    }
    
    public String toString() {
        return id + " (" + capacity + " ppl)";
    }
    
    
    
}
