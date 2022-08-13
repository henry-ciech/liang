package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " ?");
        int answer = scanner.nextInt();

        if (answer == number1 + number2 + number3) {
            System.out.println("Correct");
        } else {
            System.out.println("incorrect");
        }
    }
}
