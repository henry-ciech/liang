package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side1:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter side2:");
        double side2 = scanner.nextDouble();

        System.out.println("Enter side3:");
        double side3 = scanner.nextDouble();

        if (isValid(side1, side2, side3)) {
            System.out.printf("Area: %.1f%n", computeArea(side1, side2, side3));
        } else {
            System.out.println("Invalid input");
        }
    }


    private static boolean isValid(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }


    private static double computeArea(double side1, double side2, double side3) {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.pow(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2)
                * (halfPerimeter - side3), 0.5);
    }
}
