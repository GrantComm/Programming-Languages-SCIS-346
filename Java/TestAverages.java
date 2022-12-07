
// Grant Commodore
import javax.swing.*;
import java.awt.event.*;

/**
 * This program uses a GUI to get four test
 * scores and display their average.
 */
public class TestAverages extends JFrame {
    private JPanel panel;
    private JLabel messageLabel;
    private JTextField score1TextField;
    private JTextField score2TextField;
    private JTextField score3TextField;
    private JTextField score4TextField;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 500;

    /**
     * Constructor for the TestAverages class.
     */
    public TestAverages() {
        // Set the window title.
        setTitle("Test Averages");
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
        messageLabel = new JLabel("Enter four test scores");
        // Create a text field 10 characters wide.
        score1TextField = new JTextField(5);
        score2TextField = new JTextField(5);
        score3TextField = new JTextField(5);
        score4TextField = new JTextField(5);
        // Create a button with the caption "Convert to Celsius".
        calcButton = new JButton("Calculate Average");
        // Add an action listener to the button.
        calcButton.addActionListener(new CalcButtonListener());
        // Create a JPanel object and let the panel
        // field reference it.
        panel = new JPanel();
        // Add the label, text field, and button
        // components to the panel.
        panel.add(messageLabel);
        panel.add(score1TextField);
        panel.add(score2TextField);
        panel.add(score3TextField);
        panel.add(score4TextField);
        panel.add(calcButton);
    }

    /**
     * CalcButtonListener is an action listener class for
     * the Calculate Average button.
     */
    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double score1, score2, score3, score4, average;
            // Get the text entered by the user into the
            // score1TextField component.
            score1 = Double.parseDouble(score1TextField.getText());
            score2 = Double.parseDouble(score2TextField.getText());
            score3 = Double.parseDouble(score3TextField.getText());
            score4 = Double.parseDouble(score4TextField.getText());
            // Calculate the average.
            average = (score1 + score2 + score3 + score4) / 4.0;
            // Display the average.
            JOptionPane.showMessageDialog(null, "The average is " + average + " (" + getLetterGrade(average) + ")");
        }

        // Get the letter grade for the average.
        public String getLetterGrade(double average) {
            String letterGrade;
            if (average >= 93) {
                letterGrade = "A+";
            } else if (average >= 90) {
                letterGrade = "A";
            } else if (average >= 87) {
                letterGrade = "A-";
            } else if (average >= 83) {
                letterGrade = "B+";
            } else if (average >= 80) {
                letterGrade = "B";
            } else if (average >= 77) {
                letterGrade = "B-";
            } else if (average >= 73) {
                letterGrade = "C+";
            } else if (average >= 70) {
                letterGrade = "C";
            } else if (average >= 67) {
                letterGrade = "C-";
            } else if (average >= 63) {
                letterGrade = "D+";
            } else if (average >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }
            return letterGrade;
        }
    }

    /**
     * The main method creates an instance of the
     * TestAverages class, which causes it to display
     * its window.
     */
    public static void main(String[] args) {
        new TestAverages();
    }
}
