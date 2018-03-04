/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author seankeever
 */
public class WordInspection {

    private File file;
    private List<String> wordList = new ArrayList<String>();

    public WordInspection(File file) {
        
        this.file = file;

        try {

            Scanner reader = new Scanner(file, "UTF-8");

            while (reader.hasNextLine()) {
                wordList.add(reader.nextLine());
            }

        } catch (Exception e) {
            
            System.out.println("Something happened.");

        }

    }

    public int wordCount() {
        return wordList.size();
    }

    public List<String> wordsContainingZ() {
        List<String> containsZ = new ArrayList<String>();
        for (String word : wordList) {
            if (word.contains("z")) {
                containsZ.add(word);
            }
        }
        return containsZ;

    }
    
    public List<String> wordsEndingInL() {
        List<String> endingInL = new ArrayList<String>();
        for (String word : wordList) {
            if (word.charAt(word.length() - 1) == 'l') {
                endingInL.add(word);
            }
        }
        return endingInL;
    }
    
    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>();
        for (String word : wordList) {
            if (word.equals(reversedWord(word))) {
                palindromes.add(word);
            }
            
        }
        return palindromes;
    }
    
    private String reversedWord(String word) {
        String s = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            s += word.charAt(i);
        }
        return s;
    }
    
    public List<String> wordsWhichContainAllVowels() {
        List<String> allVowels = new ArrayList<String>();
        for (String word : wordList) {
            if (containsAllVowels(word)) {
                allVowels.add(word);
            }
            
        }
        return allVowels;
    }
    
    public boolean containsAllVowels(String word) {
        return stringToCharacterSet(word).containsAll
        (stringToCharacterSet("aeiouyäö"));
    }
    
    public Set<Character> stringToCharacterSet(String word) {
        Set<Character> set = new HashSet();
        for (char c : word.toCharArray()) {
            set.add(c);
        }
        return set;
    }


}
