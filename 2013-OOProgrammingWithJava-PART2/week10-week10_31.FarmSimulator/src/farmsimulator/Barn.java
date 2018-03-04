/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author seankeever
 */
public class Barn {
    
    private BulkTank tank;
    private MilkingRobot milkingRobot = null;
    
    public Barn(BulkTank tank) {
        this.tank = tank;
        
    }
    
    public BulkTank getBulkTank() {
        if (milkingRobot != null) {
            return milkingRobot.getBulkTank();
        }
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(this.tank);
    }
    
    public void setMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
    }
    
    
    
    public void takeCareOf(Cow cow) {
        checkForMilkingRobot();
        milkingRobot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        checkForMilkingRobot();
        for (Cow cow : cows) {
            milkingRobot.milk(cow);
        }
        
    }
    
    @Override
    public String toString() {
        this.tank = milkingRobot.getBulkTank();
        return tank.toString();
    }
    
    private void checkForMilkingRobot() {
        if (milkingRobot == null) {
            throw new IllegalStateException("Milking robot not installed.");
        }
    }
    
    
    
}
