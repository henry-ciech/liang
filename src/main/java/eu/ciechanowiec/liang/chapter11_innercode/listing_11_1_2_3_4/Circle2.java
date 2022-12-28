package eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4;

public class Circle2 extends GeometricObject {
    private double radius;

    public Circle2() {
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void printCircle() {
        System.out.printf("The Circle is created %s and the radius is %.2f", getDateCreated(), radius);
    }
}
