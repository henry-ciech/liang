package eu.ciechanowiec.liang.chapter05_innercode;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Listing_5_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator random = new Random();
        int number1 = random.nextInt(11);
        int number2 = random.nextInt(11);

        System.out.printf("What is %d + %d?%n", number1, number2);
        int answer = scanner.nextInt();

        while (number1 + number2 != answer) {
            System.out.printf("Wrong answer. Try again. What is %d + %d?%n2", number1, number2);
            answer = scanner.nextInt();
        }

        System.out.println("You got it");
    }
}
