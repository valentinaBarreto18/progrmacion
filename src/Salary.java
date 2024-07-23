import javax.swing.*;

//EJERCICIO8

public class Salary {

        public String personName;
        public int hoursWorked;
        private int totalSalary;


        public int getTotalSalary() {
            return totalSalary;
        }


        private void setTotalSalary(int totalSalary) {
            this.totalSalary = totalSalary;
        }

        public void calculateTotalSalary() {
            if (hoursWorked <= 10) {
                setTotalSalary(hoursWorked * 30000);
            } else {
                setTotalSalary(hoursWorked * 33000);
            }
        }


        public void showSalaryMessage() {
            JOptionPane.showMessageDialog(null, String.format("Dear %s, the number of hours worked is %d and your salary is $%d", personName, hoursWorked, getTotalSalary()), "Total Salary", JOptionPane.INFORMATION_MESSAGE);
        }


        public void requestSalaryData() {
            try {
                personName = JOptionPane.showInputDialog("Enter your name:");
                hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of hours worked during the week:"));

                calculateTotalSalary();
                showSalaryMessage();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for the number of hours worked.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


