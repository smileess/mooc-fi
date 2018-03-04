/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
import java.util.ArrayList;
import java.util.Collections;

public class Airport {

    private ArrayList<Flight> flights;
    private ArrayList<Airplane> planes;

    public Airport() {
        this.flights = new ArrayList<Flight>();
        this.planes = new ArrayList<Airplane>();

    }

    public void addPlane(Airplane airplane) {
        planes.add(airplane);

    }

    public void addFlight(Flight flight) {
        flights.add(flight);

    }

    public Airplane findPlane(String id) {
        for (Airplane plane : planes) {
            if (id.equals(plane.getID())) {
                return plane;
            }
        }

        return null;

    }

    public void printPlanes() {
        
        for (Airplane plane : planes) {
            System.out.println(plane);

        }
    }

    public void printFlights() {
        
        for (Flight flight : flights) {
            System.out.println(flight);
        }
        System.out.println();
    }

    public void printPlaneInfo(String id) {
        System.out.println(findPlane(id));
        System.out.println();

    }
    

}
