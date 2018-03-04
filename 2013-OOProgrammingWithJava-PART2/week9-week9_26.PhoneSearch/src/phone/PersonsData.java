/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author seankeever
 */
public class PersonsData {
    
    private String address = "";
    private Set<String> numbers = new HashSet<String>();

    public String getAddress() {
        if (!address.isEmpty())
            return address;
        return "";
    }

    public Set<String> getNumbers() {
        return numbers;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addNumber(String number) {
        this.numbers.add(number);
    }
    
    
    
    
    
}
