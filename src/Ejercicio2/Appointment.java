package Ejercicio2;

import javax.swing.*;

public class Appointment {
    String apointmentCode;
    String date;
    String time;
    String office;
    String doctorName;
    String patientName;
    private String medicalCenter;

    public Appointment(String appointmentCode, String date, String time, String office, String doctorName, String patientName, String medicalCenter) {

        this.apointmentCode = appointmentCode;
        this.date = date;
        this.time = time;
        this.office = office;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.medicalCenter = medicalCenter;
    }

    public String getMedicalCenter() {
        return medicalCenter;
    }

    public void setMedicalCenter(String apointmentCode) {
        this.medicalCenter = apointmentCode;
    }

    public void createAppointment() {
        apointmentCode = JOptionPane.showInputDialog(null, "enter the code");
        date = JOptionPane.showInputDialog(null, "enter the date");
        time = JOptionPane.showInputDialog("enter the time");
        office = JOptionPane.showInputDialog(null, "enter the office");
        doctorName = JOptionPane.showInputDialog("enter the doctor");
        patientName = JOptionPane.showInputDialog("enter de patien's name");
    }
        public void consultAppointment() {
            JOptionPane.showMessageDialog(null, "Appointment code:" + apointmentCode +
                    "\nDate:" + date +
                    "\nTime:" + time +
                    "\nOficce:" + office +
                    "\nDoctor's Name:" + doctorName +
                    "\nPatient's Name:" + patientName +
                    "\nMedical Center:" + medicalCenter);
        }

            public void changeTime () {
                time = JOptionPane.showInputDialog("Enter the new time");
            }
        }










