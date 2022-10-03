package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_33 {

    private static final int X = 0;
    private static final int Y = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] points = new double[4][2];

        System.out.println("Enter x1 y1 x2 y2 x3 y3 x4 y4: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        double[] centerPoint = getIntersectingPoint(points);
        double[] area = new double[4];

        for (int i = 0; i < points.length; i++) {
            int j = ((i + 1) % points.length);
            double[][] triangle = new double[][] {
                    points[i], points[j], centerPoint
            };
            double triangleArea = getTriangleArea(triangle);
            area[i] += triangleArea;
        }

        sort(area);
        System.out.print("The areas are ");
        for (double v : area) {
            System.out.printf("%2.2f ", v);
        }
        System.out.println();
    }

    private static void sort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentIndex = j;
                    currentMin = list[j];
                }
            }
            if (currentIndex != i) {
                list[currentIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }


    private static double getTriangleArea(double[][] points) {
        double side1 = distanceBetweenTwoPoints(points[0][0], points[0][1], points[1][0], points[1][1]);
        double side2 = distanceBetweenTwoPoints(points[0][0], points[0][1], points[2][0], points[2][1]);
        double side3 = distanceBetweenTwoPoints(points[2][0], points[2][1], points[1][0], points[1][1]);
        double s = (side1 + side2 + side3) / 2;
        double area = s * (s - side1) * (s - side2) * (s - side3);

        if (area < 0.000001) {
            return 0;
        } else {
            return Math.sqrt(area);
        }
    }

    private static double distanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    private static double[][] findTwoFurthestPoints(double[][] points) {

        double[][] p = new double[2][2];
        double distance = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = 1 + i; j < points.length; j++) {
                double tDistance =
                        distanceBetweenTwoPoints(points[i][0], points[i][1], points[j][0],points[j][1]);
                if (tDistance > distance) {
                    p[0] = points[i];
                    p[1] = points[j];
                    distance = tDistance;
                }
            }
        }

        return new double[][] {
                p[0],p[1]
        };
    }

    private static double[] getIntersectingPoint(double[][] points) {
        double[][] p1 = findTwoFurthestPoints(points);
        double[][] p2 = exclude(points, p1);

        double a = p1[0][Y] - p1[1][Y];
        double b = -(p1[0][X] - p1[1][X]);
        double c = p2[0][Y] - p2[1][Y];
        double d = -(p2[0][X] - p2[1][X]);
        double e = (p1[0][Y] - p1[1][Y]) * p1[0][X] - (p1[0][X] - p1[1][X]) * p1[0][Y];
        double f = (p2[0][Y] - p2[1][Y]) * p2[0][X] - (p2[0][X] - p2[1][X]) * p2[0][Y];
        double abMinusBc = a * d - b * c;

        if (abMinusBc == 0) {
            return new double[0];
        }
        double[] point = new double[2];
        point[X] = (e * d - b * f) / abMinusBc;
        point[Y] = (a * f - e * c) / abMinusBc;
        return point;
    }


    private static double[][] exclude(double[][] points, double[][] exclude) {
        double[][] doubles = new double[2][2];
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = 1 + i; j < points.length; j++) {
                if (exclude[0] != points[i] && exclude[1] != points[j]) {
                    doubles[0] = points[i];
                    doubles[1] = points[j];
                }
            }
        }
        return new double[][] {doubles[0],doubles[1]};
    }
}
