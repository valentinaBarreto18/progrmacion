package Ejercicio4;

import javax.swing.*;

//EJERCICIO4

public class  EmployeePayment {
    String employeeCode;
    private double basicSalary;
    private double extraHours;
    private int totalHours;
    private double deductions;
    private double loanDeductions;
    private double bonus;
    private double netPay;

    public EmployeePayment(){{
    this.basicSalary = basicSalary;
    this.extraHours = extraHours;
    this.totalHours = totalHours;
    this.deductions = deductions;
    this.loanDeductions = loanDeductions;
    this.bonus = bonus;
    this.netPay = netPay;}

    }


    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getOvertimeHours() {return extraHours;}


    public void setOvertimeHours(double overtimeHours) {
        this.extraHours = extraHours;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getLoanDeductions() {
        return loanDeductions;
    }

    public void setLoanDeductions(double loanDeductions) {
        this.loanDeductions = loanDeductions;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public double calculatextrashours() {
        double overtimeRate = basicSalary / 150;
        return overtimeRate;
    }

    public double calculateEarned() {
        return basicSalary + calculatextrashours() + bonus;
    }

    public double calculateDeductions() {
        return deductions + loanDeductions;
    }

    public void calculateNetPay() {
        double earned = calculateEarned();
        double deducted = calculateDeductions();
        this.netPay = earned - deducted;
    }

    public void requestDataAndCalculate() {
        setEmployeeCode(JOptionPane.showInputDialog("Enter the employee code:"));
        setBasicSalary(Double.parseDouble(JOptionPane.showInputDialog("Enter the basic salary:")));
        setOvertimeHours(Double.parseDouble(JOptionPane.showInputDialog("Enter the overtime hours worked:")));
        setTotalHours(Integer.parseInt(JOptionPane.showInputDialog("Enter the total hours per month:")));
        setDeductions(Double.parseDouble(JOptionPane.showInputDialog("Enter the deductions:")));
        setLoanDeductions(Double.parseDouble(JOptionPane.showInputDialog("Enter the loan deductions:")));
        setBonus(Double.parseDouble(JOptionPane.showInputDialog("Enter the bonus:")));

        calculateNetPay();


        JOptionPane.showMessageDialog(null, String.format(
                "Employee Code: %s\nBasic ejercicio8.Salary: %.2f\nOvertime Hours: %.2f\nTotal Hours: %d\nDeductions: %.2f\nLoan Deductions: %.2f\nBonus: %.2f\nNet Pay: %.2f",
                getEmployeeCode(), getBasicSalary(), getOvertimeHours(), getTotalHours(), getDeductions(), getLoanDeductions(), getBonus(), getNetPay()
        ), "Employee Payment Details", JOptionPane.INFORMATION_MESSAGE);
    }
}






