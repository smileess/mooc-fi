/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author seankeever
 */
public class UserInterface {

    private Scanner reader;
    private HandleData data = new HandleData();

    public UserInterface(Scanner reader) {
        this.reader = reader;
    }

    public void start() {

        String command = "";

        while (true) {

            command = getCommand();

            if (command.equals("1")) {
                addPhoneNumber();
            } else if (command.equals("2")) {
                phoneNumberSearchByPerson();
            } else if (command.equals("3")) {
                nameSearchByPhoneNumber();
            } else if (command.equals("4")) {
                addAddress();
            } else if (command.equals("5")) {
                personalInformationSearchByPerson();
            } else if (command.equals("6")) {
                removePersonalInformation();
            } else if (command.equals("7")) {
                keywordSearch();
            } else if (command.equalsIgnoreCase("x")) {
                break;
            } else {
                System.out.println("Not a valid command.");
            }

            System.out.println();

        }

    }

    private String getCommand() {
        System.out.print("command: ");
        return getInput();
    }

    private String getInput() {
        return stringClean(reader.nextLine());
    }

    private String stringClean(String word) {
        return word.trim();
    }

    private void addPhoneNumber() {
        System.out.print("whose number: ");
        String name = getInput();
        System.out.print("number: ");
        String number = getInput();
        data.addNumber(name, number);

    }

    private void phoneNumberSearchByPerson() {
        System.out.print("whose number: ");
        String name = getInput();

        Set<String> numbers = data.searchForNumberByName(name);

        if (numbers != null) {
            for (String number : numbers) {
                System.out.println(" " + number);
            }
        } else {
            System.out.println("  not found");
        }
    }

    private void nameSearchByPhoneNumber() {
        System.out.print("number: ");
        String number = getInput();
        String name = data.searchForNameByNumber(number);
        if (name != null) {
            System.out.println(" " + name);
        } else {
            System.out.println(" not found");
        }
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = getInput();
        System.out.print("street: ");
        String street = getInput();
        System.out.print("city: ");
        String city = getInput();
        String address = street + " " + city;
        data.addAddress(name, address);
    }

    private void personalInformationSearchByPerson() {

        System.out.print("whose information: ");
        String name = getInput();
        
        try {
            
            Set<String> numbers = data.searchForNumberByName(name);
            String address = data.searchForAddressByName(name);
            
            printInfo(address, numbers);
            
        } catch (Exception e) {
            System.out.println("  not found");
        }
        

    }



    private void removePersonalInformation() {
        System.out.print("whose information: ");
        String name = getInput();
        data.remove(name);
        data.remove(name);
    }

    private void keywordSearch() {

        System.out.print("keyword (if empty, all listed): ");
        String keyword = getInput();

        Map<String, PersonsData> searchedList = data.searchInfoByKeyword(keyword);

        if (searchedList.isEmpty()) {
            System.out.println(" keyword not found");
        } else {
            printSearchedData(searchedList);
        }
    }

    private void printSearchedData(Map<String, PersonsData> searched) {

        for (Map.Entry<String, PersonsData> e : searched.entrySet()) {

            System.out.println();

            String name = e.getKey();
            String address = e.getValue().getAddress();
            Set<String> numbers = e.getValue().getNumbers();

            System.out.println(" " + name);

            printInfo(address, numbers);

        }
    }

    private void printInfo(String address, Set<String> numbers) {
        
        if (address.isEmpty()) {
            System.out.println("  address unknown");;
        } else {
            System.out.println("  address: " + address);
        }

        if (numbers.isEmpty()) {
            System.out.println("  phone number not found");
        } else {
            System.out.println("  phone numbers:");
            for (String number : numbers) {
                System.out.println("   " + number);
            }
        }
    }

}
