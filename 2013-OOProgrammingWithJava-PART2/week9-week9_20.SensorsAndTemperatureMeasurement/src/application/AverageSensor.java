/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seankeever
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors = new ArrayList<Sensor>();
    private List<Integer> readings = new ArrayList<Integer>();

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();    
        }
    }

    @Override
    public int measure() {
        if (isOn() == false) {
            throw new IllegalStateException("Average sensor must be on.");
        }
        
        if (sensors.isEmpty()) {
            throw new IllegalStateException("Need sensors in list.");
        }
        
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        }
        int measurement = sum / sensors.size();
        readings.add(measurement);
        
        return sum / sensors.size();
    }
    
    public List<Integer> readings() {
        return readings;
    }

}
