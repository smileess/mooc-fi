/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
public class Calculator {
    
    private Reader reader;
    private int count;
    
    public Calculator() {
        reader = new Reader();
        count = 0;
        
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                //count++;
            } else if (command.equals("difference")) {
                difference();
                //count++;
            } else if (command.equals("product")) {
                product();
                //count++;
            }
        }

        statistics();
    }
    
    private void sum() {
        int[] values = getValues();
        System.out.println("sum of the values " + (values[0] + values[1]));
        System.out.println();
    }
    
    private void difference() {
        int[] values = getValues();
        System.out.println("difference of the values " + (values[0] - values[1]));
        System.out.println();
    }
    
    private void product() {
        int[] values = getValues();
        System.out.println("product of the values " + values[0] * values[1]);
        System.out.println();
        
    }
    
    private void statistics() {
        System.out.println("Calculations done " + count);
    }
    
    private int[] getValues() {
        count++;
        int[] values = new int[2];
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        return values;
    } 


}
