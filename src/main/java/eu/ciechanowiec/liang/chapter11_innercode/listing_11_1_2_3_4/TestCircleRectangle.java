package eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4;

public class TestCircleRectangle {

    public static void main(String[] args) {
        Circle2 circle = new Circle2(1);
        Rectangle2 rectangle = new Rectangle2(2, 4);

        System.out.println("A circle " + circle.toString());
        System.out.println("Test color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        System.out.println("\nA rectangle  " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
