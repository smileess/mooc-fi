/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author seankeever
 */
public class ContainerHistory {
    
    private List<Double> history = new ArrayList<Double>();
    
    public void add(double situation) {
        history.add(situation);
    }
    
    public void reset() {
        history.clear();
    }
    
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        return Collections.max(history);
    }
    
    public double minValue() {
        return Collections.min(history);
    }
    
    public double average() {
        double sum = 0;
        for (Double value : history) {
            sum += value;
        }
        return sum / history.size();
    }
    
    public double greatestFluctuation() {
        
        if (history.isEmpty() || history.size() == 1) {
            return 0;
        }
        
        List<Double> changes = new ArrayList<Double>();
        
        for (int i = 1; i < history.size(); i++) {
            
            double value1 = history.get(i - 1);
            double value2 = history.get(i);
            
            double change = Math.abs(value1 - value2);        
            changes.add(change);
        }
        return Collections.max(changes);
    }
    
    public double variance() {
        
        if (history.isEmpty() || history.size() == 1) {
            return 0;
        }
        double average = average();
        double sum = 0;
        double denominator = history.size() - 1;
        for (Double i : history) {
            double result = i - average;
            result = Math.pow(result, 2);
            sum += result;
        }
        return sum / denominator;
  
    }
    

}
