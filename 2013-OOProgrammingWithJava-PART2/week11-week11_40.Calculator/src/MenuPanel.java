
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
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
public class MenuPanel extends JPanel {

    public MenuPanel(JTextField input, JTextField output) {
        super(new GridLayout(1, 3));
        createComponents(input, output);
    }

    private void createComponents(JTextField input, JTextField output) {

        PersonalCalculator calculator = new PersonalCalculator();
        
        JButton addNumber = new JButton("+");
        JButton subtractNumber = new JButton("-");
        JButton clearNumber = new JButton("Z");
        
        Listener listener = new Listener(calculator, input, output, addNumber,
                subtractNumber, clearNumber);
        
        addNumber.addActionListener(listener);
        subtractNumber.addActionListener(listener);
        clearNumber.addActionListener(listener);

        add(addNumber);
        add(subtractNumber);
        add(clearNumber);

        clearNumber.setEnabled(false);

    }

}
