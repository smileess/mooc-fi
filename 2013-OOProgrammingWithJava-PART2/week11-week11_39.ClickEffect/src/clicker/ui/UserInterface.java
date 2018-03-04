package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    
    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        
        JLabel value = new JLabel("0");
        
        JButton clicker = new JButton("Click!");
        ClickListener listener = new ClickListener(calculator, value);
        clicker.addActionListener(listener);
        
        container.add(value, BorderLayout.WEST);
        container.add(clicker, BorderLayout.SOUTH);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
