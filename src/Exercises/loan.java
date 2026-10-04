package Exercises;

import java.util.Date;

public class loan {

        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private Date loanDate;

        // No-argument constructor
        public loan() {
            annualInterestRate = 2.5;
            numberOfYears = 1;
            loanAmount = 1000;
            loanDate = new Date();
        }

        // Constructor with arguments
        public loan(double annualInterestRate, int numberOfYears, double loanAmount) {
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new Date();
        }

        // Getters
        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public int getNumberOfYears() {
            return numberOfYears;
        }

        public double getLoanAmount() {
            return loanAmount;
        }

        public Date getLoanDate() {
            return loanDate;
        }

        // Setters
        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public void setNumberOfYears(int numberOfYears) {
            this.numberOfYears = numberOfYears;
        }

        public void setLoanAmount(double loanAmount) {
            this.loanAmount = loanAmount;
        }

        // Calculate monthly payment
        public double getMonthlyPayment() {
            double monthlyInterestRate = annualInterestRate / 1200;
            int numberOfPayments = numberOfYears * 12;

            double monthlyPayment =
                    loanAmount * monthlyInterestRate /
                            (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfPayments));

            return monthlyPayment;
        }

        // Calculate total payment
        public double getTotalPayment() {
            return getMonthlyPayment() * numberOfYears * 12;
        }



    public static void main(String[] args) {

        loan loan = new loan();

        System.out.println("Loan Amount: " + loan.getLoanAmount());
        System.out.println("Monthly Payment: " + loan.getMonthlyPayment());
        System.out.println("Total Payment: " + loan.getTotalPayment());
    }

    }

