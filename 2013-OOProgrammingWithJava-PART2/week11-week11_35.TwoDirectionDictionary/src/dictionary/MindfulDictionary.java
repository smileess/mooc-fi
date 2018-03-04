/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author seankeever
 */
public class MindfulDictionary {

    private Map<String, String> dictionary = new HashMap<String, String>();
    private String fileName;

    public MindfulDictionary() {
        this(null);
    }



    public MindfulDictionary(String file) {
        this.fileName = file;
    }

    public boolean load() {

        try {
            File file = new File(this.fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");

                dictionary.put(parts[0], parts[1]);

            }
            return true;

        } catch (Exception e) {
            System.out.println("File not found.");
            return false;
        }

    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.fileName);
            for (String word : dictionary.keySet()) {
                writer.write(word + ":" + dictionary.get(word) + "\n");
            }
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("file could not be saved.");
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }

    }

    public void remove(String word) {
        String finnishWord = "";
        String englishWord = "";
        for (Map.Entry<String, String> e : dictionary.entrySet()) {
            finnishWord = e.getKey();
            englishWord = e.getValue();
            if (word.equals(englishWord) || word.equals(finnishWord)) {
                break;
            }
        }
        dictionary.remove(finnishWord, englishWord);

    }

    public String translate(String word) {

        for (Map.Entry<String, String> e : dictionary.entrySet()) {
            if (e.getValue().equals(word)) {
                return e.getKey();
            }
            if (e.getKey().equals(word)) {
                return e.getValue();
            }

        }
        return null;
    }

}
