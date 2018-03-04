/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author seankeever
 */
public class Analysis {

    private List<String> lines = new ArrayList<String>();

    public Analysis(File file) throws Exception {
        
        Scanner reader = new Scanner(file);
        
        while (reader.hasNextLine()) {
            lines.add(reader.nextLine());
        }
        
        reader.close();     
    }
    
    public int lines() {
        return lines.size();
    }
    
    public int characters() {
        int numOfChar = 0;
        for (String line : lines) {
            numOfChar += line.length();
        }
        return numOfChar + lines.size();
    }
    
}
