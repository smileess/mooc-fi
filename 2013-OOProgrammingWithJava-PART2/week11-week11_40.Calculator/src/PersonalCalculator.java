/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
public class PersonalCalculator implements Calculator {
    
    private int value = 0;
    
    @Override
    public void add(int number) {
        this.value += number;
    }
    
    @Override
    public void subtract(int number) {
        this.value -= number;
    }
    
    @Override
    public void clear() {
        this.value = 0;
    }

    @Override
    public int getValue() {
        return this.value;
    }
    
}
