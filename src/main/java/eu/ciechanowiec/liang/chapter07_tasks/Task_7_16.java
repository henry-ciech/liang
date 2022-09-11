package eu.ciechanowiec.liang.chapter07_tasks;

import eu.ciechanowiec.liang.chapter07_innercode.Listing_7_6;
import eu.ciechanowiec.liang.chapter07_innercode.Listing_7_7;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

class Task_7_16 {

    public static void main(String[] args) {
        double startTime = System.currentTimeMillis();
        RandomGenerator random = new Random();
        int[] numbers = new int[100_000];
        int number;
        int key = random.nextInt(100_000);

        for (int i = 0; i < numbers.length; i++) {
            number = random.nextInt();
            numbers[i] = number;
        }

        Listing_7_6.linearSearch(numbers, key);

        Arrays.sort(numbers);

        Listing_7_7.binarySearch(numbers, key);
        double endTime = System.currentTimeMillis();
        double executiveTime = (endTime - startTime) / 1000;

        System.out.printf("Executive time in seconds: %.3f%n", executiveTime);
    }
}
