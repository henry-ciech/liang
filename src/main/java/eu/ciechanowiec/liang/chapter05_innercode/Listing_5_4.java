package eu.ciechanowiec.liang.chapter05_innercode;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Listing_5_4 {

    private static final int NUMBER_OF_QUESTION = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator random = new Random();
        int count = 0;
        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";

        while (count < NUMBER_OF_QUESTION) {
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            int result = number1 - number2;

            System.out.printf("What is %d - %d?%n", number1, number2);
            int answer = scanner.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.printf("Your answer is wrong.%n%d - %d should be %d%n", number1, number2, result);
            }

            output += "\n" + number1 + " - " + number2 + " = " + answer +
                    ((number1 - number2 == answer) ? " correct" : " wrong" );

            count++;
        }

        long endTime = System.currentTimeMillis();
        double testTime = (endTime - startTime) / 1_000;

        System.out.printf("""
                Correct count: %d
                Test time: %4.2f seconds
                %s%n
                """, correctCount, testTime, output);
    }
}

