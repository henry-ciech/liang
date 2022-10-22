package eu.ciechanowiec.liang.chapter10_tasks.task_10_13;

class Rectangle {

    private final double x;
    private final double y;
    private final double width;
    private final double height;

    Rectangle() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return (width + height) * 2;
    }

    boolean contains(double x, double y) {
        return getDistance(this.y, y) <= height / 2 &&
                getDistance(this.x, x) <= width / 2;
    }

    boolean contains(Rectangle rectangle) {
        return getDistance(y, rectangle.getY()) + rectangle.getHeight() / 2 <= height / 2 &&
                getDistance(x, rectangle.getX()) + rectangle.getWidth() / 2 <= width / 2 &&
                height / 2 + rectangle.getHeight() / 2 <= height &&
                width / 2 + rectangle.getWidth() / 2 <= width;
    }

    boolean overlaps(Rectangle rectangle) {
        return !contains(rectangle) &&
                ((x + width / 2 > rectangle.getX() - rectangle.getWidth()) ||
                        (y + height / 2 > rectangle.getY() - rectangle.getHeight())) &&
                (getDistance(y, rectangle.getY()) < height / 2 + rectangle.getHeight() / 2) &&
                (getDistance(x, rectangle.getX()) < width / 2 + rectangle.getWidth() / 2);
    }

    double getDistance(double point1, double point2) {
        return Math.sqrt(Math.pow(point2 - point1, 2));
    }

    double getY() {
        return y;
    }

    double getX() {
        return x;
    }

    double getHeight() {
        return height;
    }

    double getWidth() {
        return width;
    }
}
