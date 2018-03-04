/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
public class Flight {
    
    private Airplane plane;

    private String departure;
    private String destination;
    
    public Flight(Airplane plane, String departure, String destination) {
        
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
        
    }

    public Airplane getPlane() {
        return plane;
    }
    
    
    
    
    
    @Override
    public String toString() {
        return this.plane + " (" + departure + "-" + destination + ")";
    }
    
}
