package Ejercicio3;

public class Main3 {
    public static void main(String[] args) {

        BookLoan loan = BookLoan.createLoan();

        loan.viewLoanDetails();

        loan.checkLoanStatus();

    }
}
