/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author seankeever
 */
public class Thermometer implements Sensor {

    private boolean statusOn = false;
    private Random random = new Random();

    @Override
    public boolean isOn() {
        return statusOn;

    }

    @Override
    public void on() {
        statusOn = true;
    }

    @Override
    public void off() {
        statusOn = false;
    }

    @Override
    public int measure() {
        if (statusOn = true) {
            while (true) {
                int temp = random.nextInt(30 + 1 + 30) - 30;
                if (temp >= -30) {
                    return temp;
                }
            }
        } else {
            throw new IllegalStateException("Cannot measure if thermometer status is off");
        }
    }

}
