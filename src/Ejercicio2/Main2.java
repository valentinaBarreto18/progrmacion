package Ejercicio2;

import javax.swing.*;
public class Main2 {
    public static void main(String[] args) {
        Appointment appointment = new Appointment("A123", "2024-08-01", "10:00 AM", "Room 101", "Dr. Smith", "John Doe", "Health Center");
        appointment.changeTime();
        appointment.consultAppointment();

    }
    }





