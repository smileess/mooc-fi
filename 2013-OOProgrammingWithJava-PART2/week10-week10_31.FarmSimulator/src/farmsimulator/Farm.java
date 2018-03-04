/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author seankeever
 */
public class Farm implements Alive {
    
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        barn.installMilkingRobot(milkingRobot);
    }

    public String getOwner() {
        return owner;
    }
    
    public void addCow(Cow cow) {
        cows.add(cow);
    }
    
    public String toString() {
        String animals = "";
        if (cows.isEmpty()) {
            animals = "No cows.";
        } else {
            animals += "Animals: ";
            for (Cow cow : cows) {
                animals += "\n" + "        " + cow;
            }
        }
        String string = "Farm owner: " + owner + "\n" +
                "Barn bulk tank: " + barn.getBulkTank() +
                        "\n" + animals;
        return string;
    }
    
    

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }
    
    public void manageCows() {
        barn.takeCareOf(cows);
    }
    
}
