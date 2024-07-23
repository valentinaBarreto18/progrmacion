package Ejercicio7;

import javax.swing.*;
//EJERCICIO7

public class Complaint {

    public int complaintNumber;
    private String personName;
    public String subject;
    public String complaintDescription;
    private String complaintStatus;


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }


    public void validateComplaintStatus() {
        if ("pending".equalsIgnoreCase(complaintStatus)) {
            JOptionPane.showMessageDialog(null, "The complaint is pending.", "Ejercicio7.Complaint Status", JOptionPane.INFORMATION_MESSAGE);
        } else if ("in process".equalsIgnoreCase(complaintStatus)) {
            JOptionPane.showMessageDialog(null, "The complaint is in process.", "Ejercicio7.Complaint Status", JOptionPane.INFORMATION_MESSAGE);
        } else if ("resolved".equalsIgnoreCase(complaintStatus)) {
            JOptionPane.showMessageDialog(null, "The complaint has been resolved.", "Ejercicio7.Complaint Status", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Unknown complaint status.", "Ejercicio7.Complaint Status", JOptionPane.WARNING_MESSAGE);
        }
    }


    public void receiptMessage() {
        JOptionPane.showMessageDialog(null, "Ejercicio7.Complaint received successfully.\nEjercicio7.Complaint Number: " + complaintNumber + "\nSubject: " + subject + "\nDescription: " + complaintDescription, "Ejercicio7.Complaint Receipt", JOptionPane.INFORMATION_MESSAGE);
    }


    public void requestComplaintData() {
        try {
            complaintNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the complaint number:"));
            personName = JOptionPane.showInputDialog("Enter the person's name:");
            subject = JOptionPane.showInputDialog("Enter the complaint subject:");
            complaintDescription = JOptionPane.showInputDialog("Enter the complaint description:");
            complaintStatus = JOptionPane.showInputDialog("Enter the complaint status (pending/in process/resolved):");

            receiptMessage();
            validateComplaintStatus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for the complaint number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
