package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r1;
        double r2;

        System.out.println("Enter a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            r1 = (int) ((-b + Math.pow(discriminant, 0.5)) / (2 * a) * 1000) / 1000.0;
            r2 = (int) ((-b - Math.pow(discriminant, 0.5)) / (2 * a) * 1000) / 1000.0;

            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            r1 = (int) ((-b + Math.pow(discriminant, 0.5)) / (2 * a) * 1000) / 1000.0;
            System.out.println("The equation has one root " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
