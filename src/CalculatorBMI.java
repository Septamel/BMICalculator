/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahma_Izza
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorBMI extends JFrame {
    private JTextField weightField, heightField, resultField;

    public CalculatorBMI() {
        setTitle("BMI Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10)); // 4 rows, 2 columns, with gaps

        // Create components
        JLabel weightLabel = new JLabel("Weight (kg): ");
        weightField = new JTextField(10);

        JLabel heightLabel = new JLabel("Height (m): ");
        heightField = new JTextField(10);

        JButton calculateButton = new JButton("Calculate BMI");

        JLabel resultLabel = new JLabel("Your BMI: ");
        resultField = new JTextField(10);
        resultField.setEditable(false); // Make it read-only

        // Add components to the frame
        add(weightLabel);
        add(weightField);
        add(heightLabel);
        add(heightField);
        add(new JLabel()); // Empty label for spacing
        add(calculateButton);
        add(resultLabel);
        add(resultField);

        // Add action listener to the calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateBMI();
            }
        });

        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    private void calculateBMI() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            double bmi = weight / (height * height);

            // Display BMI in the result field
            resultField.setText(String.format("%.2f", bmi));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid weight and height.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorBMI();
            }
        });
    }
}
