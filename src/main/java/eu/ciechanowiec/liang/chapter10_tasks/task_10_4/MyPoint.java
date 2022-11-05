package eu.ciechanowiec.liang.chapter10_tasks.task_10_4;

public class MyPoint { //I need publics here

    private double x;
    private double y;

    MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(double x2, double y2) {
        return Math.sqrt((y2 - y) * (y2 - y) + (x2 - x) * (x2 - x));
    }

    public double distance(MyPoint point) {
        return Math.sqrt((point.y - y) * (point.y - y) + (point.x - x) * (point.x - x));
    }

    double distance(MyPoint myPoint1, MyPoint myPoint2) {
        return Math.sqrt((myPoint2.y - myPoint1.y) * (myPoint2.y - myPoint1.y) + (myPoint2.x - myPoint1.x)
                * (myPoint2.x - myPoint1.x));
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public boolean onTheLineSegment(MyPoint p0, MyPoint p1) {
        return onTheLineSegment(p0.x, p0.y, p1.x, p1.y, x, y);
    }

    public boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
    }
}
