/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */


public class Change {
    
    private int count;
    private char oldChar;
    private char newChar;
    
    public Change(char fromCharacter, char toCharacter) {
        count = 0;
        oldChar = fromCharacter;
        newChar = toCharacter;
    }
    
    public String change(String given) {
        return given.replace(oldChar, newChar);
    }
    
    
}
