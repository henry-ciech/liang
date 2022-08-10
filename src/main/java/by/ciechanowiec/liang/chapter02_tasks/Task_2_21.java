package by.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter investment amount");
        double investmentAmount = scanner.nextDouble();

        System.out.println("Enter annual interest rate in percentage");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Enter number of years");
        double numberOfYears = scanner.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        System.out.println("Future value is $" + (int)(futureInvestmentValue * 100) / 100.0);
    }
}
