package eu.ciechanowiec.liang.chapter09_tasks.task_9_6;

import java.util.Random;
import java.util.random.RandomGenerator;

class StopWatchTest {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] array = generateArray();

        stopWatch.start();
        performSelectionSort(array);
        stopWatch.stop();
        System.out.printf("Execution time: %.1f sec%n", stopWatch.getElapsedTime() / 1000);
    }

    private static int[] generateArray() {
        RandomGenerator random = new Random();
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(100000));
        }
        return array;
    }

    private static void performSelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
}
