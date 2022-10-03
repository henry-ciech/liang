package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] numbers = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix by row:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf("Sum of elements at column %d is %.1f%n", i, sumColumn(numbers, i));
        }
    }

    private static double sumColumn(double[][] numbers, int columnIndex) {
        double total = 0;
        for (double[] number : numbers) {
            total += number[columnIndex];
        }

        return total;
    }
}
