package eu.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

public class Task_2_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Enter the input as an integer whose last two digits represent the cents.
                For example, the input 1156 represents 11 dollars and 56 cents:
                """);
        int amountToPrint = input.nextInt();
        int amount = amountToPrint;

        int numberOfOneDollars = amount / 100;
        amount %= 100;

        int numberOfQuarters = amount / 25;
        amount %= 25;

        int numberOfDimes = amount / 10;
        amount %= 10;

        int numberOfNickels = amount / 5;
        amount %= 5;

        int numberOfPennies = amount;

        System.out.println("Your amount " + amountToPrint + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
