package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Random;
import java.util.random.RandomGenerator;

class Task_7_13 {

    public static void main(String[] args) {
        int numbersPerLine = 15;
        int count = 1;

        for (int i = 1; i <= 45; i++) {
            if (count % numbersPerLine == 0) {
                System.out.printf("%4d%n", getRandom(1, 100,4, 8, 95, 93));
            } else {
                System.out.printf("%4d ", getRandom(1, 100,4, 8, 95, 93));
            }
            count++;
        }
    }

    private static int getRandom(int min, int max, int... numbers) {
        RandomGenerator random = new Random();
        int randomNumber = random.nextInt(max + 1 - min) + min;

        for (int i = 0; i < numbers.length;) {
            if (randomNumber == numbers[i]) {
                randomNumber = random.nextInt(max + 1 - min) + min;
                i = 0;
            } else {
                i++;
            }
        }
        return randomNumber;
    }
}
