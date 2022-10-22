package eu.ciechanowiec.liang.chapter10_tasks.task_10_15;

class Rectangle {

    private final double x;
    private final double y;
    private final double width;
    private final double height;

    Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getHeight() {
        return height;
    }

    double getWidth() {
        return width;
    }

    static Rectangle getRectangle(double[][] points) {
        double maxX = findMaxX(points);
        double maxY = findMaxY(points);
        double minX = findMinX(points);
        double minY = findMinY(points);
        double width = maxX - minX;
        double height = maxY - minY;
        double centerX = (maxX + minX) / 2;
        double centerY = (maxY + minY) / 2;
        return new Rectangle(centerX, centerY, width, height);
    }

    static double findMinX(double[][] points) {
        double minPoint = points[0][0];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < minPoint) {
                minPoint = points[i][0];
            }
        }
        return minPoint;
    }

    static double findMinY(double[][] points) {
        double minPoint = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][1] < minPoint) {
                minPoint = points[i][1];
            }
        }
        return minPoint;
    }

    static double findMaxX(double[][] points) {
        double maxPoint = points[0][0];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > maxPoint) {
                maxPoint = points[i][0];
            }
        }
        return maxPoint;
    }

    static double findMaxY(double[][] points) {
        double maxPoint = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][1] > maxPoint) {
                maxPoint = points[i][1];
            }
        }
        return maxPoint;
    }
}
