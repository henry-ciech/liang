package eu.ciechanowiec.liang.chapter11_tasks.task_11_15;

import eu.ciechanowiec.liang.chapter10_tasks.task_10_4.MyPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Polygon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the points:");
        int numOfPoints = scanner.nextInt();

        System.out.println("Enter the coordinates of the points: ");
        ArrayList<MyPoint> points = new ArrayList<>();

        for (int i = 0; i < numOfPoints; i++) {
            points.add(new MyPoint(scanner.nextDouble(), scanner.nextDouble()));
        }

        System.out.printf("total area: %.1f%n", getPolygonArea(points));
    }

    static double getPolygonArea(List<MyPoint> points) {
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < points.size(); i++) {
            int limitIndex = (i + 1) % points.size();
            MyPoint p1 = points.get(i);
            MyPoint p2 = points.get(limitIndex);
            System.out.printf("P1 index = %d%n", i);
            System.out.printf("P2 index = %d%n", limitIndex);
            sum1 += (p1.getX() * p2.getY());
            sum2 += (p1.getY() * p2.getX());
        }

        double area = 0.5 * (sum1 - sum2);
        return (area > 0) ? area : -area;
    }
}
