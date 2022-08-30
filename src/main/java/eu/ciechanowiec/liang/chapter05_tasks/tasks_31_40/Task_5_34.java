package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Task_5_34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator random = new Random();
        int userCount = 0;
        int computerCount = 0;

        while (Math.max(computerCount, userCount) - Math.min(computerCount, userCount) <= 2) {
            int number = random.nextInt(2);
            System.out.println("""
                    Choose:
                    0 - scissors
                    1 - rock
                    2 - paper
                    """);
            int choose = Integer.parseInt(scanner.nextLine());

            System.out.printf("computer choose: %d%n", number);

            if (choose == 0 && number == 0) {
                System.out.println("Draw");
            } else if (choose == 0 && number == 1) {
                System.out.println("You lose");
                computerCount++;
            } else if (choose == 0 && number == 2) {
                System.out.println("You win");
                userCount++;
            } else if (choose == 1 && number == 0) {
                System.out.println("You win");
                userCount++;
            } else if (choose == 1 && number == 1) {
                System.out.println("Draw");
            } else if (choose == 1 && number == 2) {
                System.out.println("you lose");
                computerCount++;
            } else if (choose == 2 && number == 0) {
                System.out.println("You lose");
                computerCount++;
            } else if (choose == 2 && number == 1) {
                System.out.println("You  win");
                userCount++;
            } else if (choose == 2 && number == 2) {
                System.out.println("Draw");
            } else {
                System.out.println("Invalid input");
            }

            System.out.printf("""
                    User win-count: %d
                    Computer win-count: %d%n
                    """, userCount, computerCount);
        }
    }
}
