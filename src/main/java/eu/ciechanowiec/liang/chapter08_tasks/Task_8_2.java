package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] numbers = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix by row:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = scanner.nextDouble();
            }
        }

        System.out.printf("Sum of the elements in the major diagonal is %.1f%n", sumMajorDiagonal(numbers));
    }

    private static double sumMajorDiagonal(double[][] numbers) {
        double total = 0;

        for (int i = 0, j = 0; i < numbers.length; i++, j++) {
            total += numbers[i][j];
        }

        return total;
    }
}
