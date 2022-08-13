package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle1's center x-, y-coordinates and radius:");
        double circle1X = scanner.nextDouble();
        double circle1Y = scanner.nextDouble();
        double circe1Radius = scanner.nextDouble();

        System.out.println("Enter circle1's center x-, y-coordinates and radius:");
        double circle2X = scanner.nextDouble();
        double circle2Y = scanner.nextDouble();
        double circle2Radius = scanner.nextDouble();

        double distance = Math.pow(Math.pow((circle2X - circle1X), 2) + Math.pow((circle2Y - circle1Y), 2), 0.5);

        if (distance <= circe1Radius - circle2Radius) {
            System.out.println("Circle2 i inside circle1");
        } else if (distance <= circe1Radius + circle2Radius) {
            System.out.println("Circle2 overlaps circle1");
        } else {
            System.out.println("Circle2 does not overlap circle1");
        }
    }
}
