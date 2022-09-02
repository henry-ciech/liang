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
            int number = random.nextInt(3);
            System.out.println("""
                    Choose:
                    0 - scissors
                    1 - rock
                    2 - paper
                    """);
            int userChoice = Integer.parseInt(scanner.nextLine());

            String computerChoice = (number == 0)? "scissors" : (number == 1)? "rock" : "paper";

            String userChoiceString = (userChoice == 0)? "scissors" : (userChoice == 1)? "rock" : "paper";

            System.out.printf("Computer choice: %d (%s)%n", number, computerChoice);
            System.out.printf("Your choice: %d (%s)%n", userChoice, userChoiceString);

            if (userChoice == 0 && number == 0) {
                System.out.println("Draw");
            } else if (userChoice == 0 && number == 1) {
                System.out.println("You lost");
                computerCount++;
            } else if (userChoice == 0 && number == 2) {
                System.out.println("You won");
                userCount++;
            } else if (userChoice == 1 && number == 0) {
                System.out.println("You won");
                userCount++;
            } else if (userChoice == 1 && number == 1) {
                System.out.println("Draw");
            } else if (userChoice == 1 && number == 2) {
                System.out.println("you lost");
                computerCount++;
            } else if (userChoice == 2 && number == 0) {
                System.out.println("You lost");
                computerCount++;
            } else if (userChoice == 2 && number == 1) {
                System.out.println("You  won");
                userCount++;
            } else if (userChoice == 2 && number == 2) {
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
