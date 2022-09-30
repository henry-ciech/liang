package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Arrays;
import java.util.Scanner;

class Task_8_30 {

    public static void main(String[] args) {
        double[][] a = new double[2][2];
        double[] b = new double[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a's");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter b's");
        b[0] = scanner.nextInt();
        b[1] = scanner.nextInt();
        double[] xAndY = linearEquation(a, b);

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
