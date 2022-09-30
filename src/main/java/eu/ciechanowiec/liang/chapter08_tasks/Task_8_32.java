package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] points = new double[3][2];

        System.out.println("Enter x1, y1, x2, y2, x3, y3:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        double area = getTriangleArea(points);
        if (area <= 0) {
            System.out.println("Points are on the same line");
        } else {
            System.out.printf("Area: %.1f", area);
        }
    }

    private static double getTriangleArea(double[][] points) {
        double side1 = Math.pow(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2), 0.5);
        double side2 = Math.pow(Math.pow(points[2][0] - points[0][0], 2) + Math.pow(points[2][1] - points[0][1], 2), 0.5);
        double side3 = Math.pow(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2), 0.5);

        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.pow(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3), 0.5);
    }
}
