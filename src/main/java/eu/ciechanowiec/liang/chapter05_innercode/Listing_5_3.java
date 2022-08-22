package eu.ciechanowiec.liang.chapter05_innercode;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Listing_5_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator random = new Random();
        int number = random.nextInt(100);
        int guess = -1;

        System.out.println("Guess a magic number between 0 and 100");

        while (guess != number) {
            System.out.println("Enter your guess:");
            guess = scanner.nextInt();

            if (guess == number) {
                System.out.printf("Yes the number is %d%n", number);
            } else if (guess > number && guess <= 100) {
                System.out.println("Your guess is too high");
            } else if (guess < number && guess >= 0) {
                System.out.println("Your number is too low");
            } else {
                System.out.println("Are you kidding me?");
            }
        }
    }
}
