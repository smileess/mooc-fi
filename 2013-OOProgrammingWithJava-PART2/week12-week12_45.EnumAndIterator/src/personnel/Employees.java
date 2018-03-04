/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author seankeever
 */
public class Employees {
    
    private List<Person> employees = new ArrayList<Person>();
    
    
    public void add(Person person) {
        employees.add(person);
    }
    
    public void add(List<Person> persons) {
        for (Person person : persons) {
            employees.add(person);
        }
    }
    
    public void print() {
        Iterator<Person> i = employees.iterator();
        
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> i = employees.iterator();
        
        while (i.hasNext()) {
            Person person = i.next();
            if ((person.getEducation() == education)) {
                System.out.println(person);
            }
            
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> i = employees.iterator();
        
        while (i.hasNext()) {
            
            if ((i.next().getEducation() == education)) {
                i.remove();
            }
        }
    }
    
    
}
