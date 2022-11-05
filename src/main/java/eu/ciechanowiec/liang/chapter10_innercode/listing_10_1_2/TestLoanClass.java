package eu.ciechanowiec.liang.chapter10_innercode.listing_10_1_2;

import java.util.Scanner;

class TestLoanClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter annual interest rate, for example, 8.25:");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter number of years as an integer:");
        int numberOfYears = scanner.nextInt();

        System.out.println("Enter loan amount, for example, 120000.95:");
        double loanAmount = scanner.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("""
                The loan was created on %s
                The monthly payment is %.2f
                Th total payment is %.2f
                """, loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}
