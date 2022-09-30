package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_5  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];

        System.out.println("Enter matrix1:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter matrix2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        double[][] totalMatrix = addMatrix(matrix1, matrix2);

        print(matrix1, matrix2, totalMatrix);
    }

    private static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] totalMatrix = new double[3][3];
        for (int i = 0; i < totalMatrix.length; i++) {
            for (int j = 0; j < totalMatrix[i].length; j++) {
                totalMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return totalMatrix;
    }

    private static void print(double[][] m, int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.print(m[r][j] + " ");
        }
    }

    private static void print(double[][] m1, double[][] m2, double[][] m3) {
        System.out.println("The matrices are added as follows");

        for (int i = 0; i < 3; i++) {
            print(m1, i);
            System.out.print((i == 1 ? "  +  " : "     "));
            print(m2, i);
            System.out.print((i == 1 ? "  =  " : "     "));
            print(m3, i);
            System.out.println();
        }
    }
}
