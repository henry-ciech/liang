package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Random;
import java.util.random.RandomGenerator;

class Task_7_7 {

    public static void main(String[] args) {
        RandomGenerator random = new Random();
        int check = 0;
        int[] numbers = new int[100];
        int[] count = new int[10];

        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(10);
            count[numbers[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d count: %d%n", i, count[i]);
            check += count[i];
        }

        System.out.printf("Sum: %d%n", check);
    }
}
