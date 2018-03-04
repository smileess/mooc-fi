/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
public class BoundedCounter {
    
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    
    public int getValue() {
        return this.value;
    }

    public void setValue(int givenValue) {
        if (givenValue > 0 && givenValue <= this.upperLimit) {
            this.value = givenValue;
        }
    }
    
    public void next() {
            if (this.value < this.upperLimit) {
                this.value++;
            } else {
                this.value = 0;
            }
        
               
    }
    
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;  
        } else {
            return "" + this.value;
        }
    }
    



}

    
    

    

    
    
    
        
        
    
