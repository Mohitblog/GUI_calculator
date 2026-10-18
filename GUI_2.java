import javax.swing.*;
import java.awt.*;

public class GUI_2 {

    // Reads both number fields, performs the operation and shows the result or a friendly error message.
    private static void calculate(JTextField first, JTextField second, JLabel resultLabel, char operation) {
        try {
            int num1 = Integer.parseInt(first.getText().trim());
            int num2 = Integer.parseInt(second.getText().trim());

            switch (operation) {
                case '+':
                    resultLabel.setText("Result: " + (num1 + num2));
                    break;
                case '-':
                    resultLabel.setText("Result: " + (num1 - num2));
                    break;
                case '*':
                    resultLabel.setText("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        resultLabel.setText("Cannot divide by zero");
                    } else {
                        resultLabel.setText("Result: " + ((double) num1 / num2));
                    }
                    break;
                default:
                    break;
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Enter whole numbers only");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the window and close the program when it is closed
            JFrame frame = new JFrame("Simple Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Panel for the input fields, buttons and result labels
            JPanel panel = new JPanel(new GridLayout(6, 3));

            // Label and text field for the first number
            JLabel label1 = new JLabel("Enter first number:");
            JTextField textField1 = new JTextField();
            panel.add(label1);
            panel.add(textField1);

            // Label and text field for the second number
            JLabel label2 = new JLabel("Enter second number:");
            JTextField textField2 = new JTextField();
            panel.add(label2);
            panel.add(textField2);

            // One button and one result label for each operation
            JButton addButton = new JButton("Add");
            JLabel addResult = new JLabel("Result: ", JLabel.CENTER);
            panel.add(addButton);
            panel.add(addResult);

            JButton subButton = new JButton("SUB");
            JLabel subResult = new JLabel("Result: ", JLabel.CENTER);
            panel.add(subButton);
            panel.add(subResult);

            JButton mulButton = new JButton("MUL");
            JLabel mulResult = new JLabel("Result: ", JLabel.CENTER);
            panel.add(mulButton);
            panel.add(mulResult);

            JButton divButton = new JButton("DIV");
            JLabel divResult = new JLabel("Result: ", JLabel.CENTER);
            panel.add(divButton);
            panel.add(divResult);

            // Button actions
            addButton.addActionListener(e -> calculate(textField1, textField2, addResult, '+'));
            subButton.addActionListener(e -> calculate(textField1, textField2, subResult, '-'));
            mulButton.addActionListener(e -> calculate(textField1, textField2, mulResult, '*'));
            divButton.addActionListener(e -> calculate(textField1, textField2, divResult, '/'));

            // Add the panel to the window, set its size and show it
            frame.getContentPane().add(panel);
            frame.setSize(400, 400);
            frame.setVisible(true);
        });
    }
}
