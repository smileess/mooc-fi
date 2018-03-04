/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author seankeever
 */
public class MilkingRobot extends BulkTank {
    
    private BulkTank tank;

    public MilkingRobot() {
        this.tank = null;
    }
    
    public BulkTank getBulkTank() {
        return tank;
    }
    
    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }
    
    public void milk(Milkable milkable) {
        if (tank == null) {
            throw new IllegalStateException("The milking robot has not been installed");
        } else {
            double toBeAdded = milkable.milk();
            tank.addToTank(toBeAdded);
        }
        
    }
    
    
    
    
    
}
