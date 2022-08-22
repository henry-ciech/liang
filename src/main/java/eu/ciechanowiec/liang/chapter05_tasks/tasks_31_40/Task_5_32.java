package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Task_5_32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator random = new Random();
        int lotteryDigit1 = random.nextInt(9);
        int lotteryDigit2 = lotteryDigit1;

        while (lotteryDigit2 == lotteryDigit1) {
            lotteryDigit2 = random.nextInt(9);
        }

        System.out.println("Enter your lottery pick (two digits):");
        int guess = scanner.nextInt();

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.printf("The lottery number is %d%d%n", lotteryDigit1, lotteryDigit2);

        if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
            System.out.println("Exact match: you win 10,000$");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits: you win 3,000$");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win 1,000$");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
