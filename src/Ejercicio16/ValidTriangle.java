package Ejercicio16;

import javax.swing.*;
//EJERCICIO16

public class ValidTriangle {

        private int angle1;
        private int angle2;
        private int angle3;

    public int getAngle1() {
        return angle1;
    }

    public void setAngle1(int angle1) {
        this.angle1 = angle1;
    }

    public int getAngle2() {
        return angle2;
    }

    public void setAngle2(int angle2) {
        this.angle2 = angle2;
    }

    public int getAngle3() {
        return angle3;
    }

    public void setAngle3(int angle3) {
        this.angle3 = angle3;
    }

    public boolean isValidTriangle() {

            return (angle1 + angle2 + angle3 == 180);
        }


        public void requestDataAndVerify() {
            try {

                angle1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first angle of the triangle:"));
                angle2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second angle of the triangle:"));
                angle3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third angle of the triangle:"));


                if (isValidTriangle()) {
                    JOptionPane.showMessageDialog(null, "The entered angles form a valid triangle.", "Result", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "The entered angles do not form a valid triangle.", "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter valid numerical values for the angles.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


