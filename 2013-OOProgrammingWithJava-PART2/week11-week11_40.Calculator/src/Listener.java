
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seankeever
 */
public class Listener implements ActionListener {

    private PersonalCalculator calculator;
    private JTextField output;
    private JTextField input;
    private JButton plus;
    private JButton minus;
    private JButton clear;

    public Listener(PersonalCalculator calculator, JTextField input, JTextField output, JButton plus, JButton minus, JButton clear) {
        this.calculator = calculator;
        this.output = output;
        this.input = input;
        this.plus = plus;
        this.minus = minus;
        this.clear = clear;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        

        if (e.getSource() == plus) {
            pressPlus();
        } else if (e.getSource() == minus) {
            pressMinus();
        } else {
            pressClear();
        }

    }

    private void setOutput() {
        output.setText("" + calculator.getValue());
        clear.setEnabled(calculator.getValue() != 0);
        input.setText("");
    }

    private void pressPlus() {
        try {
            this.calculator.add(Integer.parseInt(input.getText()));
            setOutput();
        } catch (Exception e) {
        }
        
    }

    private void pressMinus() {
        try {
            calculator.subtract(Integer.parseInt(input.getText()));
            setOutput();
        } catch (Exception e) {

        }
        
    }

    private void pressClear() {
        calculator.clear();
        setOutput();
    }

}
