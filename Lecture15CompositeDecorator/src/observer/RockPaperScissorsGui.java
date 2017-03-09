package observer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class represents a GUI for a basic rock-paper-scissors observer.
 */
public class RockPaperScissorsGui {
    private JFrame frame;
	private JButton move1;
	private JButton move2;
	private JButton play;
	private Game game;
	
	/**
	 * Constructs the GUI and displays it on the screen.
	 */
	public RockPaperScissorsGui() {
		game = Game.getInstance();
		setupComponents();
		handleEvents();
		doLayout();
		frame.setVisible(true);
	}
	
	// sets up graphical components in the window
	private void setupComponents() {
		frame = new JFrame("Rock-Paper-Scissors");
		frame.setLocation(300, 100);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		move1 = new JButton(new ImageIcon("blank.png"));
		move2 = new JButton(new ImageIcon("blank.png"));
		play = new JButton("Play");
	}
	
	// attaches various listeners to handle events
	private void handleEvents() {
		//implement your method here
	}
	
	// sets up containers for layout in the window
	private void doLayout() {
		Container moves = new JPanel(new FlowLayout());
		moves.add(move1);
		moves.add(move2);
		
		frame.add(moves);
		frame.add(play, BorderLayout.SOUTH);
	}

	//Implement ActionListner for "Play button"

	//Implement GameObserver

}














