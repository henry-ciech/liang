package eu.ciechanowiec.liang.chapter04_innercode;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Listing_4_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator random = new Random();
        String lottery = "" + (int) (random.nextInt(10)) + (int) (random.nextInt(10));
        System.out.println("Enter yor lottery pick (two digit):");
        String guess = scanner.nextLine();

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        System.out.println("The lottery number is " + lottery);

        if (guess.equals(lottery)) {
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit1 == lotteryDigit1
                && guessDigit2 == lotteryDigit2) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
