package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = 0.0;
        double y1 = 0.0;

        System.out.println("Enter a point with two coordinates:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);

        if (distance > 10) {
            System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle");
        } else if (distance <= 10) {
            System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");
        }
    }
}
