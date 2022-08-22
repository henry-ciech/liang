package eu.ciechanowiec.liang.chapter05_tasks.tasks_21_30;

import java.util.Scanner;

class Task_5_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //% / 1200
        double annualInterestRate = 5;

        System.out.println("Loan amount:");
        double loan = scanner.nextDouble();

        System.out.println("Number of years:");
        double numberOfYears = scanner.nextDouble();

        System.out.println("Interest rate   Monthly Payment");

        for (; annualInterestRate <= 8.00; annualInterestRate += 0.1250) {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loan * monthlyInterestRate /
                    (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

            double totalPayment = monthlyPayment * numberOfYears * 12;

            String str = "%";

            System.out.printf("%-1.3f%s%17.2f%24.2f \n",annualInterestRate ,
                    str, ((int)(monthlyPayment * 100) / 100.0), ((int)(totalPayment * 100) / 100.0));
        }
    }
}
