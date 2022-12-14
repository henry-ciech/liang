package eu.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of three points separated by spaces\n" +
                "like x1 y1 x2 y2 x3 y3:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
        double side3 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);

        double halfPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.pow(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3), 0.5);
        System.out.println("The area of the triangle is " + (int) (area * 10) / 10.0);
    }
}
