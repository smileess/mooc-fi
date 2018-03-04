package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(yes);
        buttonGroup.add(no);
        
        container.add(yes);
        container.add(no);
        
        container.add(new JLabel("Why?"));
        
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton becauseItIsFun = new JRadioButton("Because it is fun!");
        
        buttonGroup.add(noReason);
        buttonGroup.add(becauseItIsFun);
        
        container.add(noReason);
        container.add(becauseItIsFun);
        
        JButton done = new JButton("Done!");
        
        buttonGroup.add(done);
        
        container.add(done);
    }


    public JFrame getFrame() {
        return frame;
    }
}
