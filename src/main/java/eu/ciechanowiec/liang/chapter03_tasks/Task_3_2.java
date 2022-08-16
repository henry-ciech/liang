package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Task_3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator random = new Random();

        int number1 = random.nextInt() * 10;
        int number2 = random.nextInt() * 10;
        int number3 = random.nextInt() * 10;

        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " ?");
        int answer = scanner.nextInt();

        if (answer == number1 + number2 + number3) {
            System.out.println("Correct");
        } else {
            System.out.println("incorrect");
        }
    }
}
