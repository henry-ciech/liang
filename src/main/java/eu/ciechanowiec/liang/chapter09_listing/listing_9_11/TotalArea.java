package eu.ciechanowiec.liang.chapter09_listing.listing_9_11;

import eu.ciechanowiec.liang.chapter09_listing.listing_9_8_9.Circle;

class TotalArea {

    public static void main(String[] args) {
        Circle[] circleArray;
        circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    public static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[5];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }
        return circleArray;
    }

    public static void printCircleArray(Circle[] circleArray) {
        System.out.printf("%–30s%–15s%n", "Radius", "Area");
        for (Circle circle : circleArray) {
            System.out.printf("%–30f%–15f%n", circle.getRadius(),
                    circle.getArea());
        }
        System.out.println("— — — — — — — — — — — — — — — — — — — — — — — — — — — —");
        System.out.printf("%–30s%–15f%n", "The total area of circles is",
                sum(circleArray));
    }

    public static double sum(Circle[] circleArray) {
        double sum = 0;
        for (Circle circle : circleArray) {
            sum += circle.getArea();
        }
        return sum;
    }
}
