package eu.ciechanowiec.liang.chapter10_tasks.task_10_12;

import eu.ciechanowiec.liang.chapter10_tasks.task_10_4.MyPoint;

class Triangle {
    MyPoint p1;
    MyPoint p2;
    MyPoint p3;

    Triangle() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        p1 = new MyPoint(x1, y1);
        p2 = new MyPoint(x2, y2);
        p3 = new MyPoint(x3, y3);
    }

    Triangle(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    double getArea() {
        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);
        double halfPerimeter = (side1 + side2 + side3) / 2.0;

        return Math.pow(halfPerimeter *
                (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3), 0.5);
    }

    double getPerimeter() {
        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);

        return side1 + side2 + side3;
    }

    boolean contains(double x, double y) {
        double maxX = getMax(p1.getX(), p2.getX(), p3.getX());
        double maxY = getMax(p1.getY(), p2.getY(), p3.getY());

        double minX = getMin(p1.getX(), p2.getX(), p3.getX());
        double minY = getMin(p1.getX(), p2.getX(), p3.getX());

        if (x < minX || x > maxX || y < minY || y > maxY) {
            return false;
        }

        MyPoint p = new MyPoint(x, y);
        boolean side1 = p.onTheLineSegment(p1, p2);
        boolean side2 = p.onTheLineSegment(p1, p3);
        boolean side3 = p.onTheLineSegment(p2, p3);
        return side1 || side2 || side3;
    }

    boolean contains(Triangle triangle) {
        return contains(triangle.p1) && contains(triangle.p2) && contains(triangle.p3);
    }

    double getMax(double... n) {
        double max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        return max;
    }

    double getMin(double... n) {
        double min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        return min;
    }

    boolean contains(MyPoint point) {
        return contains(point.getX(), point.getY());
    }
}
