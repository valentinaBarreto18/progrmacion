import javax.swing.*;

//EJERCICIO2

public class Appointment {

   String appointmentCode;
   String date;
   String time;
   String office;
   String doctorName;
   String patientName;
   private String medicalCenter;


   public static Appointment createAppointment() {
      Appointment appointment = new Appointment();
      appointment.appointmentCode = JOptionPane.showInputDialog("Enter the appointment code:");
      appointment.date = JOptionPane.showInputDialog("Enter the appointment date (YYYY-MM-DD):");
      appointment.time = JOptionPane.showInputDialog("Enter the appointment time (HH:MM AM/PM):");
      appointment.office = JOptionPane.showInputDialog("Enter the office for the appointment:");
      appointment.doctorName = JOptionPane.showInputDialog("Enter the doctor's name:");
      appointment.patientName = JOptionPane.showInputDialog("Enter the patient's name:");
      appointment.medicalCenter = JOptionPane.showInputDialog("Enter the medical center:");
      return appointment;
   }


   public void consultAppointmentData() {
      String message = String.format("Appointment Code: %s\nDate: %s\nTime: %s\nOffice: %s\nDoctor's Name: %s\nPatient's Name: %s\nMedical Center: %s",
              appointmentCode, date, time, office, doctorName, patientName, medicalCenter);
      JOptionPane.showMessageDialog(null, message);
   }


   public void changeTime() {
      this.time = JOptionPane.showInputDialog("Enter the new appointment time:");
   }
}

