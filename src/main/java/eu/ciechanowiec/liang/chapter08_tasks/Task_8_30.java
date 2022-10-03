package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_30 {

    public static void main(String[] args) {
        double[][] matrixA = new double[2][2];
        double[] arrayB = new double[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers for a's");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter number for b's");
        arrayB[0] = scanner.nextInt();
        arrayB[1] = scanner.nextInt();
        double[] xAndY = linearEquation(matrixA, arrayB);

        if (xAndY[0] == -1) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.printf("""
               x: %f
               y: %f
               """, xAndY[0], xAndY[1]);
        }
    }

    private static double[] linearEquation(double[][] a, double[] b) {
        double[] xAndY = new double[2];
        xAndY[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        xAndY[1] = (b[1] * a[1][1] - b[0] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
            xAndY[0] = -1;
            xAndY[1] = -1;
            return xAndY;
        }
        return xAndY;
    }
}
