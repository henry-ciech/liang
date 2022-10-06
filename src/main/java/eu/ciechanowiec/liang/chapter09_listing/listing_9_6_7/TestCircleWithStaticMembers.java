package eu.ciechanowiec.liang.chapter09_listing.listing_9_6_7;

class TestCircleWithStaticMembers {

    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.printf("The number of Circle objects is %d%n", Circle.numberOfObjects);

        Circle circle1 = new Circle();

        System.out.printf("""
                After creating circle1
                circle1: radius (%.1f) and number of Circle object (%d)
                """, circle1.radius, Circle.getNumberOfObjects());

        Circle circle2 = new Circle(5);
        circle1.radius = 9;

        System.out.printf("""
                After creating circle2 and modifying circle1
                circle1: radius (%.1f) and number of Circle object (%d)
                circle2: radius (%.1f) and number of Circle object (%d)
                """, circle1.radius, Circle.getNumberOfObjects(), circle2.radius, Circle.numberOfObjects);
    }
}
