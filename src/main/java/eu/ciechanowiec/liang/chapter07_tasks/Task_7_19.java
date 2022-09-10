package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.println("First number is size of list");
        System.out.println("Enter list:");
        size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        if (isSorted(numbers)) {
            System.out.println("The list is already sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }
    }

    private static boolean isSorted(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
