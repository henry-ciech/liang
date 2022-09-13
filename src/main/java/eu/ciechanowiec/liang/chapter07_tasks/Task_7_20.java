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
        double max = numbers[0];
        int maxIndex = 0;
        double temp = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        temp = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = max;
        numbers[maxIndex] = temp;
    }

    private static void printArray(double[] array, int numberPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.1f ", array[i]);
            if ((i + 1) % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
