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
import java.util.Scanner;
import java.util.Collections;


public class BirdWatcher {
    
    private ArrayList<Bird> birds;
    private Scanner reader;
    
    public BirdWatcher() {
        
        this.birds = new ArrayList<Bird>();
        this.reader = new Scanner(System.in);
        
    }
    
    public void Start() {
        
        while (true) {
            
            System.out.print("? ");
            
            String input = getInput();

            if (check(input, "ADD")) {
                Add();

            } else if (check(input, "OBSERVATION")) {
                Observation();

            } else if (check(input, "STATISTICS")) {
                Statistics();

            } else if (check(input, "SHOW")) {
                Show();

            } else if (check(input, "QUIT")) {
                System.out.println("");
                break;

            } else {
                System.out.println("Not a valid input.");
            }


        }
    }

    public String getInput() {

        return reader.nextLine();
        
    }
    
    public void Add() {
        
        System.out.print("Name: ");
        String name = getInput();
        
        System.out.print("Latin Name: ");
        String latinName = getInput();
        
        Bird bird = new Bird(name, latinName);
        
        birds.add(bird);
        
    }
    
    public void Observation() {
        
        System.out.print("What was observed:? ");
        String name = getInput();
        
        int checker = 0;
        
        for (Bird bird : birds) {
            if (check(name, bird.getName())) {
                bird.addObservation();
                checker++;
            }
        }
        
        if (checker < 1) {
            System.out.println("Is not a bird!");
        }
    }
    
    
    public void Statistics() {
        
        Collections.reverse(birds);
        
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void Show() {
        
        System.out.print("What? ");
        
        String name = getInput();
        
        for (Bird bird : birds) {
            if (check(name, bird.getName())) {
                System.out.println(bird);
                
            }

       
        }
    }
    
    public boolean check(String input, String name) {
        if (input.equalsIgnoreCase(name)) {
            return true;
        }
        return false;
        
    }
    
    
    
}
