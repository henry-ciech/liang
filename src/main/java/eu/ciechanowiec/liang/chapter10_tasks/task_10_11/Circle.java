package eu.ciechanowiec.liang.chapter10_tasks.task_10_11;

class Circle {

    private final double x;
    private final double y;
    private final double radius;

    Circle() {
        x = 0;
        y = 0;
        radius = 1;
    }

    Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    boolean contains(double x2, double y2) {
        double distance = Math.sqrt((y2 - y) * (y2 - y) + (x2 - x) * (x2 - x));
        return radius < distance;
    }

    boolean contains(Circle circle) {
        double distance = Math.sqrt((circle.getY() - y) * (circle.getY() - y)
                + (circle.getX() - x) * (circle.getX() - x));
        return distance + circle.getRadius() < radius;
    }

    boolean overlaps(Circle circle) {
        double distance = Math.sqrt((circle.getY() - y) * (circle.getY() - y)
                + (circle.getX() - x) * (circle.getX() - x));
        return distance + circle.getRadius() >= radius;
    }

    double getY() {
        return y;
    }

    double getX() {
        return x;
    }

    double getRadius() {
        return radius;
    }
}
