package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

public class Task_3_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three points:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
        double side3 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            double perimeter = side1 + side2 + side3;
            System.out.println((int) (perimeter * 10) / 10.0);
        } else {
            System.out.println("Invalid input");
        }
    }
}
