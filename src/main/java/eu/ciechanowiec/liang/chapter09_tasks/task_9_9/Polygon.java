package eu.ciechanowiec.liang.chapter09_tasks.task_9_9;

class Polygon {

    int numberOfSides = 3;
    double side = 1;
    double x = 0;
    double y = 0;

    Polygon() {
    }

    Polygon(int numberOfSides, double side) {
        this.numberOfSides = numberOfSides;
        this.side = side;
    }

    Polygon(int numberOfSides, double side, double x, double y) {
        this.numberOfSides = numberOfSides;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    void setSide(double side) {
        this.side = side;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    double getSide() {
        return side;
    }

    int getNumberOfSides() {
        return numberOfSides;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getPerimeter() {
        return side * numberOfSides;
    }

    double getArea() {
        return (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSides));
    }
}
