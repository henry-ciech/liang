package eu.ciechanowiec.liang.chapter10_tasks.task_10_13;

class TestRectangle {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 2, 5.5, 4.9);

        System.out.printf("""
                Perimeter of rectangle: %.1f
                Area of rectangle: %1f
                Rectangle contains point: %b
                Rectangle contains another rectangle: %b
                Rectangle overlaps another rectangle: %b
                """, rectangle1.getPerimeter(), rectangle1.getArea(),
                rectangle1.contains(3, 3), rectangle1.contains(new Rectangle(4, 5, 10.5, 3.2)),
                rectangle1.overlaps(new Rectangle(3, 5, 2.3, 5.4)));
    }
}
