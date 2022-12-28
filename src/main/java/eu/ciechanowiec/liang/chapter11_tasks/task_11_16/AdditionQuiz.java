package eu.ciechanowiec.liang.chapter11_tasks.task_11_16;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class AdditionQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator random = new Random();
        int number1 = random.nextInt(11);
        int number2 = random.nextInt(11);
        ArrayList<Integer> answers = new ArrayList<>();

        System.out.printf("What is %d + %d?%n", number1, number2);
        int answer = scanner.nextInt();
        answers.add(answer);

        while (number1 + number2 != answer) {
            System.out.printf("Wrong answer. Try again. What is %d + %d?%n", number1, number2);
            answer = scanner.nextInt();
            if (answers.contains(answer)) {
                System.out.printf("You already entered %d%n", answer);
                continue;
            }
            answers.add(answer);
        }

        System.out.println("You got it");
    }

}
