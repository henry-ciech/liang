package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();

            if (isDistinct(numbers, number)) {
                numbers[count] = number;
                count++;
            }
        }

        System.out.printf("""
                Number of distinct numbers: %d
                Distinct numbers:
                """, count);

        for (int i = 0; i < count; i++) {
            System.out.printf("%d ", numbers[i]);
        }

        System.out.println();
    }

    private static boolean isDistinct(int[] array, int number) {
        boolean contains = true;

        for (int i = 0; i < 10; i ++) {
            if (array[i] == number) {
                contains = false;
                break;
            }
        }

        return contains;
    }
}
