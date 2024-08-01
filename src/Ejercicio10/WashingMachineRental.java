package Ejercicio10;

import javax.swing.*;


public class WashingMachineRental {
    private int washingMachineType; // 1 for large, 2 for small
    private int hoursRented;
    private int numberOfWashingMachines;
    private double totalCost;

    public WashingMachineRental() {
    }
    public WashingMachineRental(int washingMachineType, int hoursRented, int numberOfWashingMachines) {
        this.washingMachineType = washingMachineType;
        this.hoursRented = hoursRented;
        this.numberOfWashingMachines = numberOfWashingMachines;
        calculateTotalCost();
    }

    public int getWashingMachineType() {
        return washingMachineType;
    }

    public void setWashingMachineType(int washingMachineType) {
        this.washingMachineType = washingMachineType;
    }

    public int getHoursRented() {
        return hoursRented;
    }

    public void setHoursRented(int hoursRented) {
        this.hoursRented = hoursRented;
    }

    public int getNumberOfWashingMachines() {
        return numberOfWashingMachines;
    }

    public void setNumberOfWashingMachines(int numberOfWashingMachines) {
        this.numberOfWashingMachines = numberOfWashingMachines;
    }

    public double getTotalCost() {
        return totalCost;
    }


    public void calculateTotalCost() {
        double hourlyRate;
        if (washingMachineType == 1) {
            hourlyRate = 4000; // Large
        } else if (washingMachineType == 2) {
            hourlyRate = 3000; // Small
        } else {
            hourlyRate = 0; // Invalid type
        }


        totalCost = hourlyRate * hoursRented * numberOfWashingMachines;


        if (numberOfWashingMachines > 3) {
            totalCost *= 0.97; // 3% discount
        }
    }


    public void requestDataAndCalculate() {
        try {
            washingMachineType = Integer.parseInt(JOptionPane.showInputDialog("Enter the type of washing machine (1 for large, 2 for small):"));
            hoursRented = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of hours rented:"));
            numberOfWashingMachines = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of washing machines rented:"));

            calculateTotalCost();

            JOptionPane.showMessageDialog(null, String.format("Washing Machine Type: %s\nHours Rented: %d\nNumber of Washing Machines: %d\nTotal Cost: $%.2f",
                            washingMachineType == 1 ? "Large" : "Small", hoursRented, numberOfWashingMachines, totalCost),
                    "Rental Cost", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}