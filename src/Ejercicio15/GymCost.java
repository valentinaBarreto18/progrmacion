package Ejercicio15;

import javax.swing.*;
//EJERCICIO15

public class GymCost {

        private int days;
        private int cost;


        public int getCost() {
            return cost;
        }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDays(int days) {
            this.days = days;
        }




        public void calculateCost() {
            if (days == 15) {
                cost = 18000;
            } else if (days == 30) {
                cost = 35000;
            } else if (days == 90) { // 3 months equal 90 days
                cost = 86000;
            } else {
                cost = 0; // Not valid if it doesn't match any option
            }
        }


        public void requestDataAndCalculate() {
            try {

                setDays(Integer.parseInt(JOptionPane.showInputDialog("Enter the number of days for the membership (15, 30, or 90):")));


                if (getDays() != 15 && getDays() != 30 && getDays() != 90) {
                    JOptionPane.showMessageDialog(null, "The number of days must be 15, 30, or 90.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }


                calculateCost();

                JOptionPane.showMessageDialog(null, String.format("The cost of the membership is: $%d", getCost()), "Result", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for the days.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


        public int getDays() {
            return days;
        }
    }
