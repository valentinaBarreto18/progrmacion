package Ejercicio16;

import javax.swing.*;
//EJERCICIO16

public class ValidTriangle {

        private int angle1;
        private int angle2;
        private int angle3;


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


