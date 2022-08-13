package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

class Task_3_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        double x = (((y1 - y2) * x1 - (x1 - x2) * y1) * (x3 - x4) - (x1 - x2) * ((y3 - y4) * x3 - (x3 - x4) * x3))
                / ((y1 - y2) * (x3 - x4) - (x1 - x2) * (y3 - y4));
        double y = ((y1 - y2) * ((y3 - y4) * x3 - (x3 - x4) * x3) - ((y1 - y2) * x1 - (x1 - x2) * y1) * (y3 - y4))
                / ((y1 - y2) * (x3 - x4) - (x1 - x2) * (y3 - y4));

        if ((x >= 0 || x <= 0) && (y >= 0 || y <= 0)) {
            System.out.println("The intersecting point is at (" + (int) (x * 10) / 10.0 + ", " + (int) (x * 10) / 10.0 + ")");
        } else {
            System.out.println("The to lines are parallel");
        }
    }
}
