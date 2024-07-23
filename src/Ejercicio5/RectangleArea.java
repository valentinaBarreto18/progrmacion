package Ejercicio5;

import javax.swing.*;

//EJERCICIO5

public class RectangleArea {
    public double base;
    public double height;


    public boolean validateEnteredData() {
        if (base <= 0) {
            JOptionPane.showMessageDialog(null, "The base must be a positive value.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (height <= 0) {
            JOptionPane.showMessageDialog(null, "The height must be a positive value.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }


    public double calculateArea() {
        return base * height;
    }


    public boolean isValidNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public void requestDataAndCalculateArea() {
        String baseStr = JOptionPane.showInputDialog("Enter the base of the rectangle:");
        if (!isValidNumber(baseStr)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for the base.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String heightStr = JOptionPane.showInputDialog("Enter the height of the rectangle:");
        if (!isValidNumber(heightStr)) {
           JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for the height.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        base = Double.parseDouble(baseStr);
        height = Double.parseDouble(heightStr);

        if (validateEnteredData()) {

            double area = calculateArea();
            JOptionPane.showMessageDialog(null, String.format("The area of the rectangle is: %.2f", area), "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

