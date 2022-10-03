package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_6 {

    public static void main(String[] args) {
        double[][] matrix1 = getMatrix(1);
        double[][] matrix2 = getMatrix(2);

        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

        print(matrix1, matrix2, matrix3);
    }

    private static double[][] getMatrix(int number) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[3][3];

        System.out.printf("Enter matrix %d:%n", number);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        return matrix;
    }

    private static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrix = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int h = 0; h < matrix.length; h++) {
                    matrix[i][j] += matrix1[i][h] * matrix2[h][j];
                }
            }
        }
        return matrix;
    }

    private static void print(double[][] m, int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.printf("%5.1f", m[r][j]);
        }
    }

    private static void print(double[][] m1, double[][] m2, double[][] m3) {
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < 3; i++) {
            print(m1, i);
            System.out.print((i == 1 ? "   * " : "     "));
            print(m2, i);
            System.out.print((i == 1 ? "   = " : "     "));
            print(m3, i);
            System.out.println();
        }
    }
}
