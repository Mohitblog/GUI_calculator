

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Frame create karna
                JFrame frame = new JFrame("Number Addition GUI");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Panel create karna input fields aur button ke liye
                JPanel panel = new JPanel(new GridLayout(6, 3));

                // Label aur text field for first number
                JLabel label1 = new JLabel("Enter first number:");
                JTextField textField1 = new JTextField();
                panel.add(label1);
                panel.add(textField1);

                // Label aur text field for second number
                JLabel label2 = new JLabel("Enter second number:");
                JTextField textField2 = new JTextField();
                panel.add(label2);
                panel.add(textField2);

                // Add button aur result label
                JButton addButton = new JButton("Add");
                JLabel resultLabel = new JLabel("Result: ", JLabel.CENTER);
                panel.add(addButton);
                panel.add(resultLabel);

                JButton SubButton = new JButton("SUB");
                JLabel resultLabel1 = new JLabel("Result: ", JLabel.CENTER);
                panel.add(SubButton);
                panel.add(resultLabel1);

                JButton MulButton = new JButton("MUL");
                JLabel resultLabel2 = new JLabel("Result: ", JLabel.CENTER);
                panel.add(MulButton);
                panel.add(resultLabel2);

                JButton DivButton = new JButton("DIV");
                JLabel resultLabel3 = new JLabel("Result: ", JLabel.CENTER);
                panel.add(DivButton);
                panel.add(resultLabel3);

                // Button action listener to perform addition
                addButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Numbers ko parse karna aur result calculate karna
                        int num1 = Integer.parseInt(textField1.getText());
                        int num2 = Integer.parseInt(textField2.getText());
                        int result = num1 + num2;
                        resultLabel.setText("Result: " + result);
                    }
                });


                SubButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Numbers ko parse karna aur result calculate karna
                        int num1 = Integer.parseInt(textField1.getText());
                        int num2 = Integer.parseInt(textField2.getText());
                        int result1 = num1 - num2;
                        resultLabel1.setText("Result: " + result1);
                    }
                });

                MulButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Numbers ko parse karna aur result calculate karna
                        int num1 = Integer.parseInt(textField1.getText());
                        int num2 = Integer.parseInt(textField2.getText());
                        int result2 = num1 * num2;
                        resultLabel2.setText("Result: " + result2);
                    }
                });

                DivButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Numbers ko parse karna aur result calculate karna
                        double num1 = Integer.parseInt(textField1.getText());
                        double num2 = Integer.parseInt(textField2.getText());
                        double result3 = num1 / num2;
                        resultLabel3.setText("Result: " + result3);
                    }
                });

                // Panel ko frame mein add karna
                frame.getContentPane().add(panel);

                // Frame ka size set karna
                frame.setSize(400, 400);

                // Frame ko visible banana
                frame.setVisible(true);
            }
        });
    }
}