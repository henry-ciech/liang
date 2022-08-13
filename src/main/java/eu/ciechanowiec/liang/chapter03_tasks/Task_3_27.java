package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 200;
        int y = 100;

        System.out.println("Enter a point's x- and y- coordinates:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        if (x1 <= x && y1 <= y && x1 >= 0 && y1 >= 0) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}
