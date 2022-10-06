package eu.ciechanowiec.liang.chapter09_tasks.task_9_4;

import java.util.random.RandomGenerator;

class Random {

    public static void main(String[] args) {
        RandomGenerator random = new java.util.Random(1000);

        for (int i = 0; i < 50; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
