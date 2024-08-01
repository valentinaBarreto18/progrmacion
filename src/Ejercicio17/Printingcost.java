package Ejercicio17;

import javax.swing.*;
//EJERCICIO17

public class Printingcost {

        private int numberOfCopies;
        private double pricePerCopy;
        private double totalPrice;

    public Printingcost(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
        this.pricePerCopy = 0.0;
        this.totalPrice = 0.0;
    }
    public Printingcost() {
        this.numberOfCopies = 0;
        this.pricePerCopy = 0.0;
        this.totalPrice = 0.0;
    }


        public int getNumberOfCopies() {
            return numberOfCopies;
        }


        public void setNumberOfCopies(int numberOfCopies) {
            this.numberOfCopies = numberOfCopies;
        }


        public double getPricePerCopy() {
            return pricePerCopy;
        }

        public void setPricePerCopy(double pricePerCopy) {
            this.pricePerCopy = pricePerCopy;
        }


        public double getTotalPrice() {
            return totalPrice;
        }


        public void setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
        }


        public void calculateCost() {
            if (numberOfCopies < 500) {
                pricePerCopy = 120;
            } else if (numberOfCopies < 750) {
                pricePerCopy = 100;
            } else if (numberOfCopies < 1000) {
                pricePerCopy = 80;
            } else {
                pricePerCopy = 50;
            }
            totalPrice = numberOfCopies * pricePerCopy;
        }


        public void requestDataAndCalculate() {
            try {

                setNumberOfCopies(Integer.parseInt(JOptionPane.showInputDialog("Enter the number of copies you want to print:")));

                calculateCost();


                JOptionPane.showMessageDialog(null, String.format("Price per copy: $%.2f\nTotal price: $%.2f", getPricePerCopy(), getTotalPrice()), "Result", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for the number of copies.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }



