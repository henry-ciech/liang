package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lottery = (int) (Math.random() * 1000);

        System.out.println("Enter your lottery pick (three digits):");
        int guess = scanner.nextInt();

        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery % 100 / 10;
        int lotteryDigit3 = lottery % 10;

        int guessDigit1 = guess / 100;
        int guessDigit2 = guess % 100 / 10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery) {
            System.out.println("Exact match: you win 10,000$");
        } else if (String.valueOf(lottery).contains(String.valueOf(guessDigit1))
                && String.valueOf(lottery).contains(String.valueOf(guessDigit2))
                && String.valueOf(lottery).contains(String.valueOf(guessDigit3))) {
            System.out.println("Match all digits: you win 3,000$");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit1 == lotteryDigit3
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2
                || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1
                || guessDigit3 == lotteryDigit2
                || guessDigit3 == lotteryDigit3) {
            System.out.println("Match one or two digits: you win 1,000$");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
