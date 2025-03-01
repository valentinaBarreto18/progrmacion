package Ejercicio14;

import javax.swing.*;
//EJERCICIO9

public class AssistanceCalculator {
    private String gender;
    private int age;
    private int assistance;

    public AssistanceCalculator(String gender, int age, int assistance) {
        this.gender = gender;
        this.age = age;
        this.assistance = assistance;
    }
    public AssistanceCalculator() {
        this.gender = "";
        this.age = 0;
        this.assistance = 0;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAssistance(int assistance) {
        this.assistance = assistance;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAssistance() {
        return assistance;
    }


    public void calculateAssistance() {
        if (gender.equalsIgnoreCase("Female")) {
            if (age > 50) {
                assistance = 120000;
            } else if (age >= 30) {
                assistance = 100000;
            } else {
                assistance = 0;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            assistance = 40000;
        } else {
            assistance = 0;
        }
    }


    public void requestDataAndCalculate() {
        try {
            gender = JOptionPane.showInputDialog("Enter the gender (Female/Male):");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age:"));


            if (age < 0) {
                JOptionPane.showMessageDialog(null, "Age cannot be negative.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            calculateAssistance();


            JOptionPane.showMessageDialog(null, String.format("The monthly assistance value is: $%d", assistance), "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for the age.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}