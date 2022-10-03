package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        int count = 0;
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j =0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double[][] sortedMatrix = sortRows(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (count % 3 == 0) {
                    System.out.printf("%n%.3f ", sortedMatrix[i][j]);
                } else {
                    System.out.printf("%.3f ", sortedMatrix[i][j]);
                }

                count++;
            }
        }

        System.out.println();
    }

    private static double[][] sortRows(double[][] matrix) {
        double[][] sortedRows = new double[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, sortedRows[i], 0, matrix[0].length);
        }

        for (int i = 0; i < sortedRows.length; i++) {
            for (int j = 0; j < sortedRows[0].length - 1; j++) {
                double currentMin = sortedRows[i][j];
                int minIndex = j;
                for (int column = j + 1; column < sortedRows[0].length; column++) {
                    if (currentMin > sortedRows[i][column]) {
                        currentMin = sortedRows[i][column];
                        minIndex = column;
                    }
                }
                if (minIndex != j) {
                    sortedRows[i][minIndex] = sortedRows[i][j];
                    sortedRows[i][j] = currentMin;
                }
            }
        }
        return sortedRows;
    }
}
