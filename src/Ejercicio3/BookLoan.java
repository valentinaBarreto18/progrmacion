package Ejercicio3;

import javax.swing.*;

//EJERCICIO3

public class BookLoan {

        String loanCode;
        String loanDate;
        String bookTitle;
        String userCode;
       int loanDays;
        String loanStatus;

        public BookLoan(){
            this.loanCode = "";
            this.loanDate = "";
            this.bookTitle = "";
            this.userCode = "";
            this.loanDays = 0;
            this.loanStatus = "";
        }

        public BookLoan(String LoanCode,String LoanDate, String bookTitle, String userCode, int loanDays, String loanStatus){
            this.loanCode = LoanCode;
            this.loanDate = LoanDate;
            this.bookTitle = bookTitle;
            this.userCode = userCode;
            this.loanDays = loanDays;
            this.loanStatus = loanStatus;
        }

        public static BookLoan createLoan() {
            BookLoan loan = new BookLoan();
            loan.loanCode = JOptionPane.showInputDialog("Enter the loan code:");
            loan.loanDate = JOptionPane.showInputDialog("Enter the loan date :");
            loan.bookTitle = JOptionPane.showInputDialog("Enter the book title:");
            loan.userCode = JOptionPane.showInputDialog("Enter the user code:");
            loan.loanDays = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of loan days:"));
            loan.loanStatus = JOptionPane.showInputDialog("Enter the loan status (Active/Completed):");
            JOptionPane.showInputDialog(null, "A new book loan has been created:", "Confirmation", JOptionPane.INFORMATION_MESSAGE);

            return loan;
        }

        public void checkLoanStatus() {
            if (loanStatus.equalsIgnoreCase("Active")) {
                JOptionPane.showMessageDialog(null, "The loan status is Active.", "Loan Status", JOptionPane.INFORMATION_MESSAGE);
            } else if (loanStatus.equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "The loan status is Completed.", "Loan Status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Unknown loan status.", "Loan Status", JOptionPane.ERROR_MESSAGE);
            }
        }

        public void viewLoanDetails() {
            String message = String.format("Loan Code: %s\nLoan Date: %s\nBook Title: %s\nEjercicio1.User Code: %s\nLoan Days: %d\nLoan Status: %s",
                    loanCode, loanDate, bookTitle, userCode, loanDays, loanStatus);
            JOptionPane.showInputDialog(null, message, "Loan Details", JOptionPane.INFORMATION_MESSAGE);
        }
    }


