package eu.ciechanowiec.liang.chapter09_listing.listing_9_2;

class AlternativeCircle {

    double radius;

    public static void main(String[] args) {
        AlternativeCircle circle1 = new AlternativeCircle();
        AlternativeCircle circle2 = new AlternativeCircle(25);
        AlternativeCircle circle3 = new AlternativeCircle(125);

        System.out.printf("The area of the circle of radius %.0f is %.2f%n", circle1.radius, circle1.getArea());
        System.out.printf("The area of the circle of radius %.0f is %.2f%n", circle2.radius, circle2.getArea());
        System.out.printf("The area of the circle of radius %.0f is %.2f%n", circle3.radius, circle3.getArea());

        circle2.radius = 100;
        System.out.printf("The area of the circle of radius %.0f is %.2f%n", circle2.radius, circle2.getArea());
    }

    AlternativeCircle() {
        radius = 1;
    }

    AlternativeCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
