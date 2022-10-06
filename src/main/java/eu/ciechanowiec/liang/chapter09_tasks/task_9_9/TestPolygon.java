package eu.ciechanowiec.liang.chapter09_tasks.task_9_9;

class TestPolygon {

    public static void main(String[] args) {
        Polygon polygon1 = new Polygon();
        Polygon polygon2 = new Polygon(6,4);
        Polygon polygon3 = new Polygon(10, 4, 5.6, 7.8);

        System.out.printf("""
                Polygon1 area: %.1f
                Polygon1 perimeter: %.1f
                Polygon2 area: %.1f
                Polygon2 perimeter: %.1f
                Polygon3 area: %.1f
                Polygon3 perimeter: %.1f
                """, polygon1.getArea(), polygon1.getPerimeter(), polygon2.getArea(),
                polygon2.getPerimeter(), polygon3.getArea(), polygon3.getPerimeter());
    }
}
