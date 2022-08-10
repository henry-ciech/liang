package by.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_2 {
    private static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius and length of a cylinder");
        final double RADIUS = scanner.nextDouble();
        final double LENGTH = scanner.nextDouble();

        double area = RADIUS * RADIUS * PI;
        double volume = area * LENGTH;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
