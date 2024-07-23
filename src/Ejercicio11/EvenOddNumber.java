package Ejercicio11;

import javax.swing.*;
//EJERCICIO11

public class EvenOddNumber {
    private int number;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void determineEvenOdd() {
        if (number % 2 == 0) {
            JOptionPane.showMessageDialog(null, "The number " + number + " is even.", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The number " + number + " is odd.", "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void requestNumber() {
        try {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
            determineEvenOdd();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
