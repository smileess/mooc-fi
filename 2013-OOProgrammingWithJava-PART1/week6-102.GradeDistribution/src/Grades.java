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

public class Grades {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> scores;

    public Grades() {

        grades = new ArrayList<Integer>();
        scores = new ArrayList<Integer>();
    }

    public void developGrades() {
        
        int[] distribution = new int[6];
        
        // first we must enter the grades
        enterGrades();
        
        // then we must get lists of scores and grades
        distribution = distribution();
        
        // then we will print the results to the user
        printResults(distribution);
        
    }
    
    public void enterGrades() {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type exam scores, -1 completes:");

        while (true) {
            int score = Integer.parseInt(reader.nextLine());
            if (score == -1) {
                break;
            }
            
            if (score >= 0 && score <= 60) {
                
                scores.add(score);
                
                int grade = scoreToGrade(score);
                
                grades.add(grade);
                
            }

        }
        
        System.out.println("");
        
    }

    public int[] distribution() {
        
        int[] distribution = new int[6];

        for (int i = 0; i <= 5; i++) {
            
            int j = 0;

            for (int grade : this.grades) {

                if (grade == i) {
                    
                    j++;

                }
            }
            
            distribution[i] = j;
          

        }
        
        return distribution;

    }
    
    public void printResults(int[] array) {
        
        System.out.println("Grade distribution:");
        
        for (int i = array.length - 1; i >= 0; i--) {
            
            System.out.print(i + ": ");
   
            if (array[i] > 0) {
                
                for (int j = 0; j < array[i]; j++) {

                    System.out.print("*");

                }
            }
            

            
            System.out.println("");
            
            
        }
        
        double accepted = gradesAccepted();
        
        System.out.println("Acceptance percentage: " + accepted);

    }
    
    public double gradesAccepted() {
        
        int accept = 0;
        
        for (int grade : grades) {
            
            if (grade > 0) {
                
                accept++;
                
            }
            
        }
        
        return (double) 100 * accept / grades.size();
        
    }

    public int scoreToGrade(int score) {
        
        int lowerBound = 30;
        int upperBound = 34;
        
        for (int i = 1; i < 5; i++) {
            if (score >= lowerBound && score <= upperBound) {
                return i;

            }

            lowerBound += 5;
            upperBound += 5;
        }
        
        if (score >= lowerBound) {
            return 5;
        }
        
        return 0;

    }

}
