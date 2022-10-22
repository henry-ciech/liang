package eu.ciechanowiec.liang.chapter09_innercode.listing_9_10;

import eu.ciechanowiec.liang.chapter09_innercode.listing_9_8_9.Circle;

class TestPassObject {
    public static void main(String[] args) {
        Circle myCircle = new Circle(1);
        int n = 5;

        printAreas(myCircle, n);

        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }
    
    public static void printAreas(Circle circle, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(circle.getRadius() + "\t\t" + circle.getArea());
            circle.setRadius(circle.getRadius() + 1);
            times--;
        }
    }
}
