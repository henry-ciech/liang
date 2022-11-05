package eu.ciechanowiec.liang.chapter10_tasks.task_10_11;

class CircleTest {

    public static void main(String[] args) {
        Circle circle1 = new Circle(2, 2, 5.5);
        System.out.printf("""
                Area of circle1: %.1f
                Perimeter of circle1: %.1f
                circle1 contains point (3, 3): %b
                circle1 contains circle (4, 5, 10.5): %b
                circle1 overlaps circle (3, 5, 2.3): %b
                """, circle1.getArea(), circle1.getPerimeter(), circle1.contains(3, 3),
                circle1.contains(new Circle(4, 5, 10.5)),
                circle1.overlaps(new Circle(3, 5, 2.3))); // I've checked with other circles, it is correct
    }
}
