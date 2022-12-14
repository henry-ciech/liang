package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten number:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] distinctNumbers = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are:");
        for (int e: distinctNumbers) {
            if (e > 0) {
                System.out.printf(" %d", e);
            }
        }
        System.out.println();
    }

    private static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int i = 0;
        for (int e: list) {
            if (linearSearch(distinctList, e) == -1) {
                distinctList[i] = e;
                i++;
            }
        }
        return distinctList;
    }

    private static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
