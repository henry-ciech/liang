package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.println("Enter five points:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        String sameLine = onTheSameLine(points)? "Points are on the same line" : "Points are not on the same line";

        System.out.println(sameLine);

    }

    private static boolean onTheSameLine(double[][] points) {
        boolean sameLine = true;

        for (int i = 2; i < points.length; i++) {
            if ((points[1][0] - points[0][0]) * (points[i][1] - points[0][1]) - (points[i][0] - points[0][0]) * (points[1][1] - points[0][1]) != 0) {
                sameLine = false;
                break;
            }
        }
        return sameLine;
    }
}
