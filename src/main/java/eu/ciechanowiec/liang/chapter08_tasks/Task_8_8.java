package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        int numberOfPoints = scanner.nextInt();

        double[][] points = new double[numberOfPoints][2];

        System.out.printf("Enter %d points:%n", numberOfPoints);

        for (int i = 0; i < points.length; i++) {
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }

        int p1 = 0;
        int p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][p1]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);
                if (shortestDistance > distance) {
                    shortestDistance = distance;
                }
            }
        }

        for (double[] point : points) {
            for (double[] doubles : points) {
                if (distance(point[0], point[1], doubles[0], doubles[1]) == shortestDistance) {
                    System.out.printf("The closest two points are (%f, %f) and (%f, %f)%n",
                            point[0], point[1], doubles[0], doubles[1]);
                }
            }
        }
        System.out.printf("Their distance is %f%n", shortestDistance);
    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
