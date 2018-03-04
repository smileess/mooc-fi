/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private Airport airport;

    public UserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;

    }

    public void start() {
        System.out.println("Airport panel\n"
                + "--------------------\n");

        chooseOperation();
    }

    public void chooseOperation() {
        airportPanel();
        flightService();

    }

    public void airportPanel() {

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");

            String input = getInput();
            if (stringCheck(input, "1")) {
                addPlane();
            } else if (stringCheck(input, "2")) {
                addFlight();
            } else if (stringCheck(input, "X")) {
                System.out.println();
                break;
            }
        }
    }

    public void addPlane() {
        String id = getPlaneID();
        System.out.print("Give plane capacity: ");
        String capacity = getInput();
        airport.addPlane(new Airplane(id, capacity));
    }

    public void addFlight() {
        String id = getPlaneID();
        Airplane airplane = airport.findPlane(id);
        System.out.print("Give departure airport code: ");
        String departureCode = getInput();
        System.out.print("Give destination airport code: ");
        String destinationCode = getInput();
        airport.addFlight(new Flight(airplane, departureCode, destinationCode));

    }

    public String getPlaneID() {
        System.out.print("Give plane ID: ");
        return getInput();
    }

    public void flightService() {
        System.out.println("Flight service\n"
                + "------------\n");

        while (true) {

            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");

            String input = getInput();

            if (stringCheck(input, "1")) {
                printPlanes();
            } else if (stringCheck(input, "2")) {
                printFlights();
            } else if (stringCheck(input, "3")) {
                printPlaneInfo();
            } else if (stringCheck(input, "X")) {
                break;
            }
        }
    }

    public void printPlanes() {
        airport.printPlanes();
    }

    public void printFlights() {
        airport.printFlights();
    }

    public void printPlaneInfo() {
        airport.printPlaneInfo(getPlaneID());

    }

    public String getInput() {
        return reader.nextLine().trim().toUpperCase();
    }

    public boolean stringCheck(String input, String toCheck) {
        if (input.equals(toCheck)) {
            return true;
        }
        return false;
    }

}
