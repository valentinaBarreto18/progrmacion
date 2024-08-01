package Ejercicio19;

import javax.swing.JOptionPane;



public class CarModelChecker {
    private int modelNumber;


    public CarModelChecker(int modelNumber) {
        this.modelNumber = modelNumber;
    }


    public CarModelChecker() {
        this.modelNumber = 0;
    }

    public void checkModel() {
        int[] defectiveModels = {119, 179, 189, 190, 191, 192, 193, 194, 195, 221, 780};

        boolean isDefective = false;
        for (int model : defectiveModels) {
            if (modelNumber == model) {
                isDefective = true;
                break;
            }
        }

        if (isDefective) {
            JOptionPane.showMessageDialog(null, "The car is defective, take it to warranty.", "Defective Car", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Your car is not defective.", "Non-defective Car", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void requestModelAndCheck() {
        try {
            modelNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the model number of your car:"));
            checkModel();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for the model number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        CarModelChecker checker = new CarModelChecker();
        checker.requestModelAndCheck();
    }
}
