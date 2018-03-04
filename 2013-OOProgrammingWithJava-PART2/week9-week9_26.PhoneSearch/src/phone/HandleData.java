/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author seankeever
 */
public class HandleData {

    private Map<String, PersonsData> data;

    public HandleData() {
        this.data = new TreeMap<String, PersonsData>();
    }

    public void addNumber(String name, String number) {

        checkIfExists(name);

        this.data.get(name).addNumber(number);

    }

    public void addAddress(String name, String address) {

        checkIfExists(name);

        this.data.get(name).setAddress(address);

    }

    private void checkIfExists(String name) {
        if (!data.containsKey(name)) {
            data.put(name, new PersonsData());
        }
    }

    public Set<String> searchForNumberByName(String name) {

        if (checkForName(name)) {
            return data.get(name).getNumbers();
        }

        return null;
    }

    public String searchForAddressByName(String name) {
        
        if (checkForName(name)) {
            return data.get(name).getAddress();
        }
        return null;

    }

    private boolean checkForName(String name) {
        for (Map.Entry<String, PersonsData> e : data.entrySet()) {
            String person = e.getKey();
            if (person.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public String searchForNameByAddress(String address) {
        for (Map.Entry<String, PersonsData> e : data.entrySet()) {
            String personsAddress = e.getValue().getAddress();
            if (personsAddress.equals(address)) {
                return e.getKey();
            }
        }
        return null;
    }
    
    public String searchForNameByNumber(String number) {
        for (Map.Entry<String, PersonsData> e : data.entrySet()) {
            Set<String> personsNumbers = e.getValue().getNumbers();
            for (String personsNumber : personsNumbers) {
                if (personsNumber.equals(number)) {
                    return e.getKey();
                }
            }
        }
        return null;
    }

public void remove(String name) {
        data.remove(name);
    }

    public Map<String, PersonsData> searchInfoByKeyword(String keyword) {
        Map<String, PersonsData> matches = new TreeMap<String, PersonsData>();
        
        for (Map.Entry<String, PersonsData> e : data.entrySet()) {
            String name = e.getKey();
            String address = e.getValue().getAddress();
            if (name.contains(keyword) || address.contains(keyword)) {
                matches.put(e.getKey(), e.getValue());
            }
        }
        return matches;
    }

}
