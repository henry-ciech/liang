package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Task_3_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator random = new Random();
        int number1 = random.nextInt() * 10;
        int number2 = random.nextInt() * number1;
        int number3 = random.nextInt() * 100;
        int number4 = random.nextInt() * number3;

        System.out.println("What is " + number1 + " - " + number2 + " ?");
        int answer1 = scanner.nextInt();

        if (number1 - number2 == answer1) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }

        System.out.println("What is " + number3 + " - " + number4 + " ?");
        int answer2 = scanner.nextInt();

        if (number3 - number4 == answer2) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println(number3 + " - " + number4 + " should be " + (number3 - number4));
        }
    }
}
