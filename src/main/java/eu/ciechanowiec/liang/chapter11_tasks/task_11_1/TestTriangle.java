package eu.ciechanowiec.liang.chapter11_tasks.task_11_1;

import java.util.Scanner;

class TestTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle3 triangle = new Triangle3();

        System.out.println("Enter side1: ");
        triangle.setSide1(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter side2: ");
        triangle.setSide2(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter side3: ");
        triangle.setSide3(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Is triangle filled?");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("yes")) {
            triangle.setFilled(true);
        } else {
            triangle.setFilled(true);
        }

        System.out.println("Enter color of the triangle:");
        triangle.setColor(scanner.nextLine());

        System.out.println(triangle);
        System.out.println("area: " + triangle.getArea());
        System.out.println("perimeter: "  + triangle.getPerimeter());
        System.out.println("color: "  + triangle.getColor());
        System.out.println("is field: "  + triangle.isFilled());
    }
}
