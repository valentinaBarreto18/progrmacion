import javax.swing.*;

//EJERCICIO20

public class MobilePlan {

        private String carrier;
        private int internationalMinutes;
        private double fixedCharge;
        private double internationalMinuteRate;
        private double dataPackageRate;
        private double totalCost;


        public void calculateCost() {
            switch (carrier.toLowerCase()) {
                case "tigo":
                    fixedCharge = 45000;
                    internationalMinuteRate = 200;
                    dataPackageRate = 12000;
                    break;
                case "claro":
                    fixedCharge = 30000;
                    internationalMinuteRate = 100;
                    dataPackageRate = 18000;
                    break;
                case "movistar":
                    fixedCharge = 40000;
                    internationalMinuteRate = 250;
                    dataPackageRate = 8000;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid carrier.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }

            totalCost = fixedCharge + (internationalMinutes * internationalMinuteRate);
        }


        public void requestDataAndCalculate() {
            try {

                carrier = JOptionPane.showInputDialog("Enter the carrier (Claro, Tigo, Movistar):");


                internationalMinutes = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of international minutes used:"));


                calculateCost();

                JOptionPane.showMessageDialog(null, String.format("Carrier: %s\nFixed Charge: $%.2f\nInternational Minute Rate: $%.2f\nTotal Cost: $%.2f",
                        carrier, fixedCharge, internationalMinuteRate, totalCost), "Result", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number for the international minutes.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }



