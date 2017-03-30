package textui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

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
        this.saveButton = new JButton("Save As...");
        this.button2 = new JButton("Button 2");
        this.southwest = new JButton("Southwest");
        this.southeast = new JButton("Southeast");
        this.textarea = new JTextArea();
        this.frame = new JFrame("326 is great");

        saveButton.addActionListener(new SaveListener());

        frame.setLocation(300, 100);
        frame.setSize(400, 300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        designLayout();
        frame.setVisible(true);
    }

    private void designLayout(){
        Container topPanel = new JPanel(new FlowLayout());
        topPanel.add(saveButton);
        topPanel.add(button2);
        frame.add(topPanel, BorderLayout.NORTH);

        //wrap around : decorator pattern
        frame.add(new JScrollPane(textarea), BorderLayout.CENTER);

        Container bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(southwest, BorderLayout.WEST);
        bottomPanel.add(southeast, BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);
    }

    private class SaveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String userInputText = textarea.getText();
            JFileChooser chooser = new JFileChooser();
            chooser.showSaveDialog(frame);
            File selectedFile = chooser.getSelectedFile();
            try {
                PrintStream out = new PrintStream(selectedFile);
                out.print(userInputText);
                out.close();
            }catch (FileNotFoundException ex){
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        }
    }
}














