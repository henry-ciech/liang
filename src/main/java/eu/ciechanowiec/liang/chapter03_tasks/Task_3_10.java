package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * number1);
        int number3 = (int) (Math.random() * 100);
        int number4 = (int) (Math.random() * number3);

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
