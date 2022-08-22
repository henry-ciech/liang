package eu.ciechanowiec.liang.chapter05_tasks.tasks_21_30;

import java.util.Scanner;

class Task_5_22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Loan Amount:");
        double loanAmount = scanner.nextDouble();

        System.out.println("Number Of Years:");
        double numberOfYears = scanner.nextDouble();

        System.out.println("Annual Interest Rate:");
        double annualInterestRate = scanner.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        double monthlyPayment = loanAmount*monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        double balance = loanAmount;
        double interest;
        double principal;

        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
        System.out.printf("Total Payment: %.2f%n", monthlyPayment * 12 * numberOfYears);

        System.out.println("Payment#\tInterest\tPrincipal\tBalance");
        for (int i = 1; i <= numberOfYears * 12; i++) {
            interest = (int)(monthlyInterestRate * balance * 100) / 100.0;
            principal = (int)((monthlyPayment - interest) * 100) / 100.0;
            balance = (int)((balance - principal) * 100) / 100.0;
            System.out.println(i + "\t\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
        }
    }
}
