package eu.ciechanowiec.liang.chapter07_tasks;

import eu.ciechanowiec.liang.chapter07_innercode.Listing_7_6;
import eu.ciechanowiec.liang.chapter07_innercode.Listing_7_7;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

class Task_7_16 {

    public static void main(String[] args) {
        RandomGenerator random = new Random();
        int[] numbers = new int[100_000];
        int number;
        int key = random.nextInt(100_000);

        for (int i = 0; i < numbers.length; i++) {
            number = random.nextInt();
            numbers[i] = number;
        }


        double startTimeLinerSearch = System.currentTimeMillis();
        Listing_7_6.linearSearch(numbers, key);
        double endTimeLinerSearch = System.currentTimeMillis();

        Arrays.sort(numbers);
        double startTimeBinarySearch = System.currentTimeMillis();
        Listing_7_7.binarySearch(numbers, key);
        double endTimeBinarySearch = System.currentTimeMillis();

        double executiveTimeLinerSearch = (endTimeLinerSearch - startTimeLinerSearch) / 1000;
        double executiveTimeBinarySearch = (endTimeBinarySearch - startTimeBinarySearch) / 1000;

        System.out.printf("""
               Executive time of liner search in seconds: %.3f
               Executive time of binary search in seconds: %.3f
               """, executiveTimeLinerSearch, executiveTimeBinarySearch);
    }
}
