package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Task_5_34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator random = new Random();
        int count = 0;

        while (count <= 2) {
            int number = random.nextInt(2);
            System.out.println("""
                    Choose:
                    0 - scissors
                    1 - rock
                    2 - paper
                    """);
            int choose = Integer.parseInt(scanner.nextLine());

            if (choose == 0 && number == 0) {
                System.out.println("Draw");
            } else if (choose == 0 && number == 1) {
                System.out.println("You lose");
                count++;
            } else if (choose == 0 && number == 2) {
                System.out.println("You win");
                count++;
            } else if (choose == 1 && number == 0) {
                System.out.println("You win");
                count++;
            } else if (choose == 1 && number == 1) {
                System.out.println("Draw");
            } else if (choose == 1 && number == 2) {
                System.out.println("you lose");
                count++;
            } else if (choose == 2 && number == 0) {
                System.out.println("You lose");
                count++;
            } else if (choose == 2 && number == 1) {
                System.out.println("You  win");
                count++;
            } else if (choose == 2 && number == 2) {
                System.out.println("Draw");
            } else {
                System.out.println("Invalid input");
            }

            System.out.printf("cont: %d%n", count);
        }
    }
}