package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] points = new double[4][2];

        System.out.println("Enter 4 points for line1 and line2:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }
        double[] point = getIntersectingPoint(points);
        if (point[0] == Integer.MIN_VALUE) {
            System.out.println("Lines are parallel");
        } else {
            System.out.printf("Intersecting point: (%.1f, %.1f)", point[0], point[1]);
        }
    }

    private static double[] getIntersectingPoint(double[][] points) {
        int X = 0;
        int Y = 1;
        double[] point = new double[2];
        double a = points[0][Y] - points[1][Y];
        double b = -(points[0][X] - points[1][X]);
        double c = points[2][Y] - points[3][Y];
        double d = -(points[2][X] - points[3][X]);
        double e = (points[0][Y] - points[1][Y]) * points[0][X] - (points[0][X] - points[1][X]) * points[0][Y];
        double f = (points[2][Y] - points[3][Y]) * points[2][X] - (points[2][X] - points[3][X]) * points[2][Y];
        double abMinusBc = a * d - b * c;

        if (abMinusBc == 0) {
            point[0] = Integer.MIN_VALUE;
            point[1] = Integer.MIN_VALUE;
            return  point;
        }

        point[X] = (e * d - b * f) / abMinusBc;
        point[Y] = (a * f - e * c) / abMinusBc;

        return point;
    }
}
