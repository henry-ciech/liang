package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

import java.util.Random;
import java.util.random.RandomGenerator;

class Task_5_40 {

    public static void main(String[] args) {
        RandomGenerator random = new Random();
        int heads = 0;
        int tails = 0;

        for (int i = 1; i <= 1_000_000; i++) {
            int number = random.nextInt(2);

            if (number == 1) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.printf("""
                heads: %d
                tails: %d%n
                """, heads, tails);
    }
}
