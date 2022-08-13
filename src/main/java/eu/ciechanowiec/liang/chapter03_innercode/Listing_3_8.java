package eu.ciechanowiec.liang.chapter03_innercode;

import java.util.Scanner;

class Listing_3_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lottery = (int) (Math.random() * 100);

        System.out.println("Enter your lottery pick (two digits):");
        int guess = scanner.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery) {
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
