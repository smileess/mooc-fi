/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author seankeever
 */
public class ClickListener implements ActionListener {
    
    private Calculator calculator;
    private JLabel value;

    public ClickListener(Calculator calculator, JLabel value) {
        this.calculator = calculator;
        this.value = value;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.increase();
        
        this.value.setText(String.valueOf(this.calculator.giveValue()));
    }
    
}
