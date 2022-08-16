package eu.ciechanowiec.liang.chapter04_innercode;

import java.util.Scanner;

class Listing_4_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three points (x1,y1, x2, y2, x3, y3):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double sideA = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double sideB = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double sideC = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        double angleA = Math.toDegrees(Math.acos((sideA * sideA - sideB * sideB - sideC * sideC)
                / (-2 * sideB * sideC)));
        double angleB = Math.toDegrees(Math.acos((sideB * sideB - sideA * sideA - sideC * sideC)
                / (-2 * sideA * sideC)));
        double angleC = Math.toDegrees(Math.acos((sideC * sideC - sideB * sideB - sideA * sideA)
                / (-2 * sideA * sideB)));

        System.out.println("The three angles are " + Math.round(angleA * 100) / 100.0 + " "
                + Math.round(angleB * 100) / 100.0 + " " + Math.round(angleC * 100) / 100.0);
    }
}
