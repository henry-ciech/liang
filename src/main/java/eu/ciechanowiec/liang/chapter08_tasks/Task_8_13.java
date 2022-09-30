package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] largest;

        System.out.println("Enter the number of rows and columns of the array:");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        double[][] matrix = new double[rows][columns];

        System.out.println("Enter the array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i]. length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        largest = locateLargest(matrix);

        System.out.printf("The location of the largest element is at (%d, %d)%n", largest[0], largest[1]);
    }

    private static int[] locateLargest(double[][] matrix) {
        int[] largest = new int[2];
        int largestRow = 0;
        int largestColumn = 0;
        double largestNumber = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largestNumber) {
                    largestNumber = matrix[i][j];
                    largestRow = i;
                    largestColumn = j;
                }
            }
        }

        largest[0] = largestRow;
        largest[1] = largestColumn;

        return largest;
    }
}