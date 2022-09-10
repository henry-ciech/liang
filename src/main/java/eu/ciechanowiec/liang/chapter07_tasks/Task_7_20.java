package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        double[] numbers = new double[size];

        System.out.printf("Enter %d numbers:%n", size);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        selectionSort(numbers);
        printArray(numbers, 10);
    }

    private static void selectionSort(double[] numbers) {
        for (int i = numbers.length - 1; i > 1 ; i--) {
            int currentIndex = i;
            double currentHigh = numbers[i];

            for (int k = i - 1; k > 0; k--) {
                if (currentHigh < numbers[k]) {
                    currentIndex = k;
                    currentHigh = numbers[k];
                }
            }

            if (currentIndex != i) {
                double temp = numbers[currentIndex];
                numbers[currentIndex] = numbers[i];
                numbers[i] = temp;
            }
        }
    }

    private static void printArray(double[] array, int numberPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5.2f ", array[i]);
            if ((i + 1) % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
