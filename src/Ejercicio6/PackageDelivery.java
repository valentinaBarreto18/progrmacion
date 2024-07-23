package Ejercicio6;

import javax.swing.*;
//EJERCICIO6
public class PackageDelivery {

        public int trackingNumber;
        private String date;
        private String packagingType;
        public String clientID;
        private double weight;
        private String originCity;
        private String destinationCity;
        private double cost;
        private String deliveryStatus;


        public String getDate() { return date; }
        public void setDate(String date) { this.date = date; }

        public String getPackagingType() { return packagingType; }
        public void setPackagingType(String packagingType) { this.packagingType = packagingType; }

        public double getWeight() { return weight; }
        public void setWeight(double weight) { this.weight = weight; }

        public String getOriginCity() { return originCity; }
        public void setOriginCity(String originCity) { this.originCity = originCity; }

        public String getDestinationCity() { return destinationCity; }
        public void setDestinationCity(String destinationCity) { this.destinationCity = destinationCity; }

        public double getCost() { return cost; }
        public void setCost(double cost) { this.cost = cost; }

        public String getDeliveryStatus() { return deliveryStatus; }
        public void setDeliveryStatus(String deliveryStatus) { this.deliveryStatus = deliveryStatus; }


        public void calculateCostPerKilo() {
            double costPerKilo = 5.0; // Assuming a cost of $5 per kilo
            cost = weight * costPerKilo;
            JOptionPane.showMessageDialog(null, String.format("The shipping cost is: $%.2f", cost), "Shipping Cost", JOptionPane.INFORMATION_MESSAGE);
        }


        public void checkDeliveryStatus() {
            if ("delivered".equalsIgnoreCase(deliveryStatus)) {
                JOptionPane.showMessageDialog(null, "The package has been delivered.", "Delivery Status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The package has not been delivered.", "Delivery Status", JOptionPane.WARNING_MESSAGE);
            }
        }

        public void requestDataAndCalculateCost() {
            try {
                trackingNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the tracking number:"));
                date = JOptionPane.showInputDialog("Enter the date (dd/mm/yyyy):");
                packagingType = JOptionPane.showInputDialog("Enter the type of packaging:");
                clientID = JOptionPane.showInputDialog("Enter the client's ID:");
                weight = Double.parseDouble(JOptionPane.showInputDialog("Enter the weight of the package (kg):"));
                originCity = JOptionPane.showInputDialog("Enter the origin city:");
                destinationCity = JOptionPane.showInputDialog("Enter the destination city:");
                deliveryStatus = JOptionPane.showInputDialog("Enter the delivery status (delivered/not delivered):");

                calculateCostPerKilo();
                checkDeliveryStatus();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter valid numeric values for tracking number and weight.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }



