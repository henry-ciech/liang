package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides:");
        int numberOfSides = scanner.nextInt();

        System.out.println("Enter the side:");
        double side = scanner.nextDouble();

        System.out.printf("Area: %.1f", area(numberOfSides, side));
    }

    private static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
