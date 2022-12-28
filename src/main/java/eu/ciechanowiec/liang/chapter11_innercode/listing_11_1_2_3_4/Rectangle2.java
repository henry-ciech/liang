package eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4;

public class Rectangle2 extends GeometricObject {

    private double width;
    private double height;
    
    public Rectangle2() {

    }
    
    public Rectangle2(double width, double height) {
        this.width= width;
        this.height = height;
    }

    public Rectangle2(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}
