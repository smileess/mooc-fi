/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
import java.util.ArrayList;


public class Changer {
    
    private ArrayList<Change> changes;
    
    public Changer() {
        changes = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        changes.add(change);
    }
    
    public String change(String given) {
        for (Change change : changes) {
            given = change.change(given);
        }
    
    return given;
    }
        

}
