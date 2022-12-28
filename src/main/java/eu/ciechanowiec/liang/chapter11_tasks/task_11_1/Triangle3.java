package eu.ciechanowiec.liang.chapter11_tasks.task_11_1;

import eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4.GeometricObject;

class Triangle3 extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    Triangle3() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    Triangle3(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }

    double getArea() {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.pow(halfPerimeter
                * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3), 0.5);
    }

    double getSide1() {
        return side1;
    }

    double getSide2() {
        return side2;
    }

    double getSide3() {
        return side3;
    }

    void setSide1(double side1) {
        this.side1 = side1;
    }

    void setSide2(double side2) {
        this.side2 = side2;
    }

    void setSide3(double side3) {
        this.side3 = side3;
    }
}
