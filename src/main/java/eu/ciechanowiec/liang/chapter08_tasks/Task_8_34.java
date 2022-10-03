package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] points = new double[6][2];

        System.out.println("Enter 6 points:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }
        double[] point = getRightmostLowestPoint(points);
        System.out.printf("The rightmost lowest point is (%.1f, %.1f)%n", point[0], point[1]);
    }

    private static double[] getRightmostLowestPoint(double[][] points) {
        double[] point = new double[2];
        double smallestValue = points[0][1];
        double rightMost = points [0][0];
        int smallestValueIndex = 0;
        for (int i = 1; i < points.length; i++) {
            if (points[i][1] <= smallestValue && points[i][0] >= rightMost) {
                smallestValue = points[i][1];
                smallestValueIndex = i;
            }
        }

        point[0] = points[smallestValueIndex][0];
        point[1] = points[smallestValueIndex][1];
        return point;
    }
}
