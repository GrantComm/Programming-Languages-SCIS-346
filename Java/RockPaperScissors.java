
// Grant Commodore
import javax.swing.*;
import java.awt.event.*;

/**
 * This program uses a GUI to play
 * a game of rock, paper, scissors.
 */
public class RockPaperScissors extends JFrame {
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 500;
    private JPanel panel;
    private JLabel messageLabel;
    private JRadioButton rockButton;
    private JRadioButton paperButton;
    private JRadioButton scissorsButton;
    private ButtonGroup buttonGroup;
    private int userChoice;
    private int computerChoice;

    /**
     * Constructor for the RockPaperScissors class.
     */
    public RockPaperScissors() {
        // Set the window title.
        setTitle("Rock, Paper, Scissors");
        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Build the panel and add it to the frame.
        buildPanel();
        // Add the panel to the frame's content pane.
        add(panel);
        // Display the window.
        setVisible(true);
    }

    /**
     * The buildPanel method adds a label, text fields, and
     * and a button to the panel.
     */
    private void buildPanel() {
        // Create a label to display instructions.
        messageLabel = new JLabel("Choose rock, paper, or scissors");
        // Create a button with the caption "Rock", "Paper", and "Scissors".
        rockButton = new JRadioButton("Rock");
        paperButton = new JRadioButton("Paper");
        scissorsButton = new JRadioButton("Scissors");
        // Add an action listener to the buttons.
        rockButton.addActionListener(new RockButtonListener());
        paperButton.addActionListener(new PaperButtonListener());
        scissorsButton.addActionListener(new ScissorsButtonListener());
        // Create a JPanel object and let the panel
        // field reference it.
        panel = new JPanel();

        // Create a ButtonGroup object.
        buttonGroup = new ButtonGroup();
        // Add the radio buttons to the group.
        buttonGroup.add(rockButton);
        buttonGroup.add(paperButton);
        buttonGroup.add(scissorsButton);
        // Add the label and button
        // components to the panel.
        panel.add(messageLabel);
        panel.add(rockButton);
        panel.add(paperButton);
        panel.add(scissorsButton);
    }

    /**
     * Private inner class that handles the event when
     * the user clicks the rock button.
     */
    private class RockButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            userChoice = 1;
            computerChoice = (int) (Math.random() * 3) + 1;
            if (userChoice == computerChoice) {
                JOptionPane.showMessageDialog(null, "It's a tie! You both chose rock.");
            } else if (userChoice == 1 && computerChoice == 2) {
                JOptionPane.showMessageDialog(null, "You lose! The computer chose paper.");
            } else if (userChoice == 1 && computerChoice == 3) {
                JOptionPane.showMessageDialog(null, "You win! The computer chose scissors.");
            }
        }
    }

    /**
     * Private inner class that handles the event when
     * the user clicks the paper button.
     */
    private class PaperButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            userChoice = 2;
            computerChoice = (int) (Math.random() * 3) + 1;
            if (userChoice == computerChoice) {
                JOptionPane.showMessageDialog(null, "It's a tie! You both chose paper.");
            } else if (userChoice == 2 && computerChoice == 3) {
                JOptionPane.showMessageDialog(null, "You lose! The computer chose scissors.");
            } else if (userChoice == 2 && computerChoice == 1) {
                JOptionPane.showMessageDialog(null, "You win! The computer chose rock.");
            }
        }
    }

    /**
     * Private inner class that handles the event when
     * the user clicks the scissors button.
     */
    private class ScissorsButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            userChoice = 3;
            computerChoice = (int) (Math.random() * 3) + 1;
            if (userChoice == computerChoice) {
                JOptionPane.showMessageDialog(null, "It's a tie! You both chose scissors.");
            } else if (userChoice == 3 && computerChoice == 1) {
                JOptionPane.showMessageDialog(null, "You lose! The computer chose rock.");
            } else if (userChoice == 3 && computerChoice == 2) {
                JOptionPane.showMessageDialog(null, "You win! The computer chose paper.");
            }
        }
    }

    /**
     * The main method creates an instance of the
     * RockPaperScissors class, which displays its window.
     */
    public static void main(String[] args) {
        new RockPaperScissors();
    }

}
