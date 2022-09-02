package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_YEARS = 30;

        System.out.println("The amount invested: ");
        double amount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Years     Future Value");
        for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
            System.out.printf("%-10d", years);
            System.out.printf("%11.2f%n", futureInvestmentValue(amount, monthlyInterestRate, years));
        }
    }

    private static double futureInvestmentValue(
        double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
