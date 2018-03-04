/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

/**
 *
 * @author seankeever
 */
public class PersonComparator implements Comparator<Person> {
    
    private Map<Person, Integer> people;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.people = peopleIdentities;
        
    }
    
    

    @Override
    public int compare(Person o1, Person o2) {
        return people.get(o2) - people.get(o1);
    }
    
}
