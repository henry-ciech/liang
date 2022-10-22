package eu.ciechanowiec.liang.chapter09_innercode.listing_9_6_7;

class Circle {

    double radius;
    static int numberOfObjects = 0;

    Circle() {
        radius = 1;
        numberOfObjects++;
    }

    Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
