import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 * This class represents a GUI for a fairly crappy text editor.
 */
public class TextEditorGUI {
    private JButton saveButton;
    private JButton button2;
    private JButton southwest;
    private JButton southeast;
    private JFrame frame;
    private JTextArea textarea;

    // Constructs the GUI and displays it on the screen.
    public TextEditorGUI() {
        // create some components (buttons)
        saveButton = new JButton("Save As...");
        button2 = new JButton("Button 2");
        southwest = new JButton("Southwest");
        southeast = new JButton("Southeast");
        textarea = new JTextArea();

        frame = new JFrame("326 is great");
        frame.setLocation(300, 100);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // attach event listener to respond to clicks
        saveButton.addActionListener(new SaveListener());

        // use panels for Composite layout
        Container topPanel = new JPanel(new FlowLayout());
        topPanel.add(saveButton);
        topPanel.add(button2);

        Container bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(southwest, BorderLayout.WEST);
        bottomPanel.add(southeast, BorderLayout.EAST);

        // put buttons in the overall window container (the frame)
        frame.setLayout(new BorderLayout());
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // JScrollPane serves as a Decorator around the text area to add scrollbars
        frame.add(new JScrollPane(textarea), BorderLayout.CENTER);

        // show the frame on the screen
        frame.setVisible(true);
    }

    // This listener responds to clicks on the "Save As..." button.
    // It saves the text in the main text area to a given file.
    private class SaveListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String text = textarea.getText();

            // show a file chooser dialog box to pick the file name to save as
            JFileChooser chooser = new JFileChooser();
            chooser.showSaveDialog(frame);
            File selected = chooser.getSelectedFile();

            try {
                // save the file
                PrintStream out = new PrintStream(selected);
                out.print(text);
                out.close();
            } catch (FileNotFoundException e) {
                // display an error message
                JOptionPane.showMessageDialog(frame, e.getMessage());
            }
        }
    }
}














