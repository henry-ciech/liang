package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        if (x1 <= 10 / 2 && y1 <= 5.0 / 2 && x1 >= -10 / 2 && y1 >= -5.0 / 2) {
            System.out.println("Point (" + x1 + ", " + y1 + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x1 + ", " + y1 + ") is not in the rectangle");
        }
    }
}
