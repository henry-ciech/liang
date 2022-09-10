package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        System.out.printf("Index of smallest element: %d%n", indexOfSmallestElement(numbers));
    }

    private static int indexOfSmallestElement(double[] array) {
        int minIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min(array)) {
                minIndex = i;
                break;
            }
        }
        return minIndex + 1;
    }

    private static double min(double[] array) {
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
