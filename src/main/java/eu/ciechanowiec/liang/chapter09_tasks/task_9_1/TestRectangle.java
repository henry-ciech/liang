package eu.ciechanowiec.liang.chapter09_tasks.task_9_1;

class TestRectangle {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.printf("""
                Rectangle1 area: %.1f
                Rectangle1 perimeter: %.1f
                Rectangle2 area: %.1f
                Rectangle2 perimeter: %.1f
                """, rectangle1.getArea(), rectangle1.getPerimeter(), rectangle2.getArea(), rectangle2.getPerimeter());
    }
}
