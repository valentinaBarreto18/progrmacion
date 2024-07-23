package Ejercicio21;

import javax.swing.*;
//EJERCICIO21

public class SandwichOrder {



        private String size;
        private boolean bacon;
        private boolean jalapeno;
        private boolean turkey;
        private boolean cheese;
        private double totalCost;

        public void calculateCost() {
            double sandwichCost = 0;
            double baconCost = 0;
            double turkeyCost = 0;
            double cheeseCost = 0;


            if ("small".equalsIgnoreCase(size)) {
                sandwichCost = 6000;
            } else if ("large".equalsIgnoreCase(size)) {
                sandwichCost = 12000;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid sandwich size.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }


            if (bacon) {
                baconCost = 3000;
            }
            if (turkey) {
                turkeyCost = 3000;
            }
            if (cheese) {
                cheeseCost = 2500;
            }


            totalCost = sandwichCost + baconCost + turkeyCost + cheeseCost;
        }

        public void requestDataAndCalculate() {
            try {

                size = JOptionPane.showInputDialog("Enter the size of the sandwich (small or large):");


                bacon = JOptionPane.showConfirmDialog(null, "Would you like to add bacon?", "Ingredients", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                jalapeno = JOptionPane.showConfirmDialog(null, "Would you like to add jalapeno?", "Ingredients", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                turkey = JOptionPane.showConfirmDialog(null, "Would you like to add turkey?", "Ingredients", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                cheese = JOptionPane.showConfirmDialog(null, "Would you like to add cheese?", "Ingredients", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;


                calculateCost();


                JOptionPane.showMessageDialog(null, String.format("Sandwich Size: %s\nBacon: %s\nTurkey: %s\nCheese: %s\nTotal Cost: $%.2f",
                        size, bacon ? "Yes" : "No", turkey ? "Yes" : "No", cheese ? "Yes" : "No", totalCost), "Result", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An error occurred while processing the data.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        public static void main(String[] args) {
            SandwichOrder order = new SandwichOrder();
            order.requestDataAndCalculate();
        }
    }




