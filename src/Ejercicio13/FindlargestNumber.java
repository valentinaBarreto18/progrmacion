package Ejercicio13;

import javax.swing.*;

//EJERCICIO13

public class FindlargestNumber {


    public void requestDataAndFindLargest() {
        try {

            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
            int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number:"));


            int largest = num1;
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }


            JOptionPane.showMessageDialog(null, "The largest number is: " + largest, "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}




