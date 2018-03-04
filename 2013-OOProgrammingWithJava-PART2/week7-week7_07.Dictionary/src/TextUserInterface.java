/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {

        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary\n"
                + "  translate - asks a word and prints its translation\n"
                + "  quit - quit the text user interface");

        while (true) {
            System.out.println();
            System.out.print("Statement: ");
            String input = getWord();
            input = stringCleaner(input);
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {
                add();
            } else if (input.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public String stringCleaner(String word) {
        return word.toLowerCase().trim();
    }

    public void add() {
        System.out.print("In Finnish: ");
        String word = getWord();
        System.out.print("Translation: ");
        String translation = getWord();
        dictionary.add(word, translation);
    }
    
    public void translate() {
        System.out.print("Give a word: ");
        String word = getWord();
        if (dictionary.translate(word) == null) {
            System.out.println("Unknown word!");
        } else {
        System.out.println("Translation: " + dictionary.translate(word));
        }
        
    }
    
    public String getWord() {
        return reader.nextLine();
    }

}
