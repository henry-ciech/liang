package eu.ciechanowiec.liang.chapter09_innercode.listing_9_5;


import java.util.Scanner;

class TestPoint2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter point1's x-, y–coordinates: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter point2's x-, y–coordinates: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

/*      Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        System.out.println("The distance between p1 and p2 is " +
                p1.distance(p2));
        System.out.println("The midpoint between p1 and p2 is " +
                p1.midpoint(p2).toString());

    impossible to compile*/
    }
}
