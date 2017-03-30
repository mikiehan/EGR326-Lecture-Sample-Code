package multiview;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class represents a GUI for a basic rock-paper-scissors game.
 */
public class RockPaperScissorsGui {
    private JFrame frame;
    private JButton play;
    private JButton switchViews;
    private View view;
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

        view = new TextView(game);

        play = new JButton("Play");
        switchViews = new JButton("Switch Views");
    }

    // attaches various listeners to handle events
    private void handleEvents() {
        ActionListener listener = new ButtonListener();
        play.addActionListener(listener);
        switchViews.addActionListener(listener);
    }

    // sets up containers for layout in the window
    private void doLayout() {
        Container south = new JPanel(new FlowLayout());
        south.add(play);
        south.add(switchViews);

        frame.add(view, BorderLayout.CENTER);
        frame.add(south, BorderLayout.SOUTH);
    }

    // This listener responds to clicks on the "Play" button.
    private class ButtonListener implements ActionListener {
        /**
         * Called when the Play button is clicked.
         */
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == play) {
                game.playRound();
            } else {
                // switch views
                frame.remove(view);

                // hey view, stop listening now.
                view.goAway();

                if (view instanceof TextView) {
                    view = new ImageView(game);
                } else if (view instanceof ImageView) {
                    view = new PaintedView(game);
                } else {
                    view = new TextView(game);
                }

                frame.add(view, BorderLayout.CENTER);

                // tell Java to update the layout on the screen
                frame.validate();
            }
        }
    }
}














