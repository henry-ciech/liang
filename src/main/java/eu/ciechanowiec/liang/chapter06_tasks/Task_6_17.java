package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Task_6_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        printMatrix(n);
    }

    private static void printMatrix(int n) {
        RandomGenerator random = new Random();

        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d ", random.nextInt(2));
            }
            System.out.println();
        }
    }
}
