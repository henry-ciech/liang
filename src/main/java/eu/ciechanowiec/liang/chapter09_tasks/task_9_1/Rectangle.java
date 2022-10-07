package eu.ciechanowiec.liang.chapter09_tasks.task_9_1;

class Rectangle {

    private double width = 1;
    private double height = 1;

    Rectangle() {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    double getArea() {
        return height * width;
    }
}
