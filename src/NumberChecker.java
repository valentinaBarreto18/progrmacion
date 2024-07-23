import javax.swing.*;

public class NumberChecker {
    private int number;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void checkNumber() {
        if (number > 0) {
            JOptionPane.showMessageDialog(null, "The number " + number + " is positive.", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (number < 0) {
            JOptionPane.showMessageDialog(null, "The number " + number + " is negative.", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The number is zero.", "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void requestNumber() {
        try {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
            checkNumber();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker();
        numberChecker.requestNumber();
    }
}

