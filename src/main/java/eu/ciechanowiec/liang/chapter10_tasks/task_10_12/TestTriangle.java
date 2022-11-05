package eu.ciechanowiec.liang.chapter10_tasks.task_10_12;

import eu.ciechanowiec.liang.chapter10_tasks.task_10_4.MyPoint;

class TestTriangle { // Works incorrectly

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new MyPoint(2.5, 2), new MyPoint(4.2, 3),
                new MyPoint(5, 3.5));

        System.out.printf("""
                Area: %.1f
                Perimeter: %.1f
                Point is inside triangle: %b
                Contain another triangle: %b
                """, triangle.getArea(), triangle.getPerimeter(),
                triangle.contains(1, 1), triangle.contains(new Triangle(new
                        MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
    }
}
