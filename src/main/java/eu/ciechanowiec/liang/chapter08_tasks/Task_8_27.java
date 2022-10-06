package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_27 {

    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        double[][] sortedMatrix = sortColumns(matrix);

        System.out.println("\nThe column-sorted array is");
        for (double[] doubles : sortedMatrix) {
            for (int j = 0; j < sortedMatrix.length; j++) {
                System.out.print(doubles[j] + " ");
            }
            System.out.println();
        }
    }

    private static double[][] getMatrix() {
        Scanner scanner = new Scanner(System.in);
        double[][] doubles = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                doubles[i][j] = scanner.nextDouble();
            }
        }
        return doubles;
    }

    private static double[][] sortColumns(double[][] matrix)  {
        double[][] s = new double[matrix.length][matrix[0].length];

        copyMatrix(matrix, s);

        for (int col = 0; col < s.length; col++) {
            for (int row = 0; row < s.length - 1; row++) {
                double min = s[row][col];
                int index = row;
                for (int j = row + 1; j < s.length; j++) {
                    if (min > s[j][col]) {
                        min = s[j][col];
                        index = j;
                    }
                }
                if (index != row) {
                    s[index][col] = s[row][col];
                    s[row][col] = min;
                }
            }
        }
        return s;
    }

    private static void copyMatrix(double[][] original, double[][] copy) {
        for (int i = 0; i < original.length; i++) {
            System.arraycopy(original[i], 0, copy[i], 0, original[i].length);
        }
    }
}
