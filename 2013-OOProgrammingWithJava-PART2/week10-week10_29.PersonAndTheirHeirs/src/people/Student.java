/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author seankeever
 */
public class Student extends Person {
    
    private int credits = 0;
    
    
    public Student(String name, String address) {
        super(name, address);
    }
    
    public void study() {
        credits++;
    }
    
    public int credits() {
        return credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "  credits " + credits();
    }
    
    
    
    
    
}
