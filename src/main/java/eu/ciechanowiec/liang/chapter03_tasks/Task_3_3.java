package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //do NOT copy input from the book, it ain't work
        //you may copy this: 9.0 4.0 3.0 -5.0 -6.0 -21.0
        //and this: 1.0 2.0 2.0 4.0 4.0 5.0

        System.out.println("Enter a, b, c, d, e, f:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        if ( a * d - b * c != 0) {
            System.out.println("x is " + x + " and y is " + y);
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
