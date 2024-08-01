package Ejercicio1;

import javax.swing.JOptionPane;

//EJERCICIO1

public class User {
    private String baseUsername;
    private String enteredUsername;
    private String basePassword;
    private String enteredPassword;
    private boolean systemStatus;

    public User(String baseUsername, String basePassword, boolean systemStatus) {
        this.baseUsername = baseUsername;
        this.basePassword = basePassword;
        this.systemStatus = systemStatus;
    }


    public void validateStatus() {
        if (systemStatus) {
            JOptionPane.showMessageDialog(null, "The system is active.", "System Status", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The system is inactive.", "System Status", JOptionPane.ERROR_MESSAGE);
        }
    }


    public void allowAccess() {
        if (!systemStatus) {
            JOptionPane.showMessageDialog(null, "Access denied. The system is inactive.", "Access", JOptionPane.ERROR_MESSAGE);
            return;
        }


        enteredUsername = JOptionPane.showInputDialog("Enter your username:");
        enteredPassword = JOptionPane.showInputDialog("Enter your password:");


        String defaultUsername = "admin";
        String defaultPassword = "1234";

        if (defaultUsername.equals(enteredUsername) && defaultPassword.equals(enteredPassword)) {
            JOptionPane.showMessageDialog(null, "Access granted.", "Access", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect username or password.", "Access", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Getter and setter methods for private attributes
    public String getBaseUsername() {
        return baseUsername;
    }

    public void setBaseUsername(String baseUsername) {
        this.baseUsername = baseUsername;
    }

    public String getEnteredUsername() {
        return enteredUsername;
    }

    public void setEnteredUsername(String enteredUsername) {
        this.enteredUsername = enteredUsername;
    }

    public String getBasePassword() {
        return basePassword;
    }

    public void setBasePassword(String basePassword) {
        this.basePassword = basePassword;
    }

    public String getEnteredPassword() {
        return enteredPassword;
    }

    public void setEnteredPassword(String enteredPassword) {
        this.enteredPassword = enteredPassword;
    }

    public boolean isSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(boolean systemStatus) {
        this.systemStatus = systemStatus;
    }
}