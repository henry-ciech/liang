package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.println("List size:");
        size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter list:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }


        System.out.printf("The list has %d integers: ", size);
        for (int number : numbers) {
            System.out.printf("%d ", number);
        }

        if (isSorted(numbers)) {
            System.out.println("\nThe list is already sorted");
        } else {
            System.out.println("\nThe list is not sorted");
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
