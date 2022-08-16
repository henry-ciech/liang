package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Task_3_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator random = new Random();
        int number = random.nextInt() * 3;

        System.out.println("""
                Choose:
                0 - scissors
                1 - rock
                2 - paper
                """);
        int choose = scanner.nextInt();

        if (choose == 0 && number == 0) {
            System.out.println("Draw");
        } else if (choose == 0 && number == 1) {
            System.out.println("You lose");
        } else if (choose == 0 && number == 2) {
            System.out.println("You win");
        } else if (choose == 1 && number == 0) {
            System.out.println("You win");
        } else if (choose == 1 && number == 1) {
            System.out.println("Draw");
        } else if (choose == 1 && number == 2) {
            System.out.println("you lose");
        } else if (choose == 2 && number == 0) {
            System.out.println("You lose");
        } else if (choose == 2 && number == 1) {
            System.out.println("You  win");
        } else if (choose == 2 && number == 2) {
            System.out.println("Draw");
        } else {
            System.out.println("Invalid input");
        }
    }
}
