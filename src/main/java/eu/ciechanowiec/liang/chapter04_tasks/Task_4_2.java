package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 6_371.01;

        System.out.println("Enter point 1 (latitude and longitude) in degrees:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter point 2 (latitude and longitude) in degrees:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = radius * Math.acos(Math.sin(Math.toRadians(-x1))) * Math.sin(Math.toRadians(-x2))
                + Math.cos(Math.toRadians(-x1)) * Math.cos(Math.toRadians(-x2)) * Math.cos(Math.toRadians( - y1 + y2));

        System.out.println("The distance between two points is " + (-distance));
    }
}
