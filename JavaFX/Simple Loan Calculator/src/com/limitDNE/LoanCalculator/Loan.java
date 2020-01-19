package com.limitDNE.LoanCalculator;

import java.util.Date;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    protected Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears(){
        return  numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = getAnnualInterestRate() / 1200;
        double monthlyPayment = getLoanAmount() * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, getNumberOfYears() * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * getNumberOfYears() * 12;
        return totalPayment;
    }

    public Date getLoanDate(){
        return loanDate;
    }
}
