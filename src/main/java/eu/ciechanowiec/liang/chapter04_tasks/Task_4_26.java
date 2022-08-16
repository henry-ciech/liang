package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a amount, for example 11.56: ");
        String amount = input.nextLine();

        int k = amount.indexOf('.');
        String numberOfDollars = amount.substring(0, k);
        String amountOfCoins = amount.substring(k + 1);

        int remainingAmount = Integer.parseInt(amountOfCoins);

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount  / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
