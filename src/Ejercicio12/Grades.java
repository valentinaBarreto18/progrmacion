package Ejercicio12;

import javax.swing.JOptionPane;
//EJERCICIO12

public class Grades {
    private double physics;
    private double chemistry;
    private double biology;
    private double mathematics;
    private double computerScience;
    private double average;

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getBiology() {
        return biology;
    }

    public void setBiology(double biology) {
        this.biology = biology;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getMathematics() {
        return mathematics;
    }

    public void setMathematics(double mathematics) {
        this.mathematics = mathematics;
    }

    public double getComputerScience() {
        return computerScience;
    }

    public void setComputerScience(double computerScience) {
        this.computerScience = computerScience;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void calculateAverage() {
        average = (physics + chemistry + biology + mathematics + computerScience) / 5;
    }

    public String getGrade() {
        if (average < 6) {
            return "Poor";
        } else if (average >= 6 && average <= 8) {
            return "Good";
        } else {
            return "Excellent";
        }
    }


    public void requestGrades() {
        try {
            physics = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade for Physics:"));
            chemistry = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade for Chemistry:"));
            biology = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade for Biology:"));
            mathematics = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade for Mathematics:"));
            computerScience = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade for Computer Science:"));


            if (physics < 0 || physics > 10 || chemistry < 0 || chemistry > 10 ||
                    biology < 0 || biology > 10 || mathematics < 0 || mathematics > 10 ||
                    computerScience < 0 || computerScience > 10) {
                JOptionPane.showMessageDialog(null, "Ejercicio12.Grades must be between 0 and 10.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            calculateAverage();
            String grade = getGrade();


            JOptionPane.showMessageDialog(null, String.format("Average: %.2f\nGrade: %s", average, grade), "Results", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
