package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.printf("gcd: %d%n", gcd(numbers));
    }

    private static int gcd(int... numbers) {
        int gcd = -1;
        boolean isDivisor;

        for (int divisor = 1; divisor <= min(numbers); divisor++) {
            isDivisor = true;
            for (int number : numbers) {
                if (number % divisor != 0) {
                    isDivisor = false;
                    break;
                }
            }

            if (isDivisor) {
                gcd = divisor;
            }
        }
        return gcd;
    }

    private static int min(int... numbers) {
        int min = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }
}
