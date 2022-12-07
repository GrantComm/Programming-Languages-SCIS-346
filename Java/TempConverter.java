
// Grant Commodore
import javax.swing.*;
import java.awt.event.*;

/**
 * The TempConverter class displays a JFrame that
 * lets the user enter a temperature in degrees Fahrenheit. When
 * the Convert to Celsius button is clicked, a dialog box is
 * displayed with the temperature in Celsius degrees.
 */
public class TempConverter extends JFrame {
    private JPanel panel;
    private JLabel messageLabel;
    private JTextField tempTextField;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 310;
    private final int WINDOW_HEIGHT = 100;

    /**
     * Constructor for the tempConverter class.
     */
    public TempConverter() {
        // Set the window title.
        setTitle("Temperature Converter");
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
     * The buildPanel method adds a label, text field, and
     * and a button to a panel.
     */
    private void buildPanel() {
        // Create a label to display instructions.
        messageLabel = new JLabel("Enter a temperature in Fahrenheit");
        // Create a text field 10 characters wide.
        tempTextField = new JTextField(10);
        // Create a button with the caption "Convert to Celsius".
        calcButton = new JButton("Convert to Celsius");
        // Add an action listener to the button.
        calcButton.addActionListener(new CalcButtonListener());
        // Create a JPanel object and let the panel
        // field reference it.
        panel = new JPanel();
        // Add the label, text field, and button
        // components to the panel.
        panel.add(messageLabel);
        panel.add(tempTextField);
        panel.add(calcButton);
    }

    /**
     * CalcButtonListener is an action listener class for
     * the Convert to Celsius button.
     */
    private class CalcButtonListener implements ActionListener {
        /**
         * The actionPerformed method executes when the user
         * clicks on the Convert to Celsius button.
         * 
         * @param e The event object.
         */
        public void actionPerformed(ActionEvent e) {
            String input; // To hold the user's input
            double degreesCelsius; // The degrees in Celsius.
            // Get the text entered by the user into the
            // text field.
            input = tempTextField.getText();

            // For debugging, display the text entered, and
            // its value converted to a double.
            System.out.println("Reading " + input +
                    " from the text field.");
            System.out.println("Converted value: " +
                    Double.parseDouble(input));
            // Convert the input to degrees Celsius.
            degreesCelsius = (Double.parseDouble(input) - 32.0) * 5 / 9;
            // Display the result.
            JOptionPane.showMessageDialog(null, input +
                    " degrees Fahrenheit is " + degreesCelsius + " degrees Celsius.");
            // For debugging, display a message indicating
            // the application is ready for more input.
            System.out.println("Ready for the next input.");
        }
    } // End of CalcButtonListener class

    /**
     * The main method creates an instance of the
     * TempConverter class, which displays
     * its window on the screen.
     */
    public static void main(String[] args) {
        new TempConverter();
    }
}