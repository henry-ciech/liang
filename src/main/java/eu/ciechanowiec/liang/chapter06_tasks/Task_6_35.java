package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side:");
        double side = scanner.nextDouble();

        System.out.printf("Area: %.1f%n", area(side));
    }

    private static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
