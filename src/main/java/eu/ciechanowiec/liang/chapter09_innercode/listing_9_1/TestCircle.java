package eu.ciechanowiec.liang.chapter09_innercode.listing_9_1;

class TestCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(25);
        Circle circle3 = new Circle(125);

        System.out.printf("The area of the circle of radius %.0f is %.2f%n", circle1.radius, circle1.getArea());
        System.out.printf("The area of the circle of radius %.0f is %.2f%n", circle2.radius, circle2.getArea());
        System.out.printf("The area of the circle of radius %.0f is %.2f%n", circle3.radius, circle3.getArea());

        circle2.radius = 100;
        System.out.printf("The area of the circle of radius %.0f is %.2f%n", circle2.radius, circle2.getArea());
    }
}
