// This program displays a simple Graphical User Interface (GUI) to demonstrate
// the Java Swing library.
// It just pops up several buttons and lets us change their color when we
// click on them.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BabysFirstGUI {
    private JButton button;
    private JButton button2;
    private JFrame frame;

    // Constructs the GUI and displays it on the screen.
    public BabysFirstGUI() {
        // create some components (buttons)
        button = new JButton("Click here to get a 4.0");
        button.setBackground(Color.RED);
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 18));

        button2 = new JButton("Click here to get a 0.0");
        button2.setBackground(Color.YELLOW);

        // attach event listener to handle mouse clicks
        MyAwesomeListener listener = new MyAwesomeListener();
        button.addActionListener(listener);
        button2.addActionListener(listener);

        // create overall window (frame) and put buttons in it
        frame = new JFrame("326 is great");
        frame.setLocation(300, 100);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // layout manager decides how to position/size the components in the frame
        frame.setLayout(new BorderLayout());
        frame.add(button, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(new Button("W"), BorderLayout.WEST);
        frame.add(new Button("I am in the EAST"), BorderLayout.EAST);

        frame.setVisible(true);
    }

    // This class handles "action events", aka mouse clicks, in buttons.
    public class MyAwesomeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                button2.setBackground(Color.BLUE);
            } else {
                // event source is button2
                button.setBackground(Color.BLUE);
            }
        }
    }
}
