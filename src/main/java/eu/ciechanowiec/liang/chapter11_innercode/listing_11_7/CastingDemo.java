package eu.ciechanowiec.liang.chapter11_innercode.listing_11_7;

import eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4.Circle2;
import eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4.Rectangle2;

class CastingDemo {

    public static void main(String[] args) {
        Object object1 = new Circle2(1);
        Object object2 = new Rectangle2(1, 1);

        displayObject(object1);
        displayObject(object2);
    }

    static void displayObject(Object object) {
        if (object instanceof  Circle2) {
            System.out.println("The circle area is " +
                    ((Circle2)object).getArea());
            System.out.println("The circle diameter is " +
                    ((Circle2)object).getDiameter());
        } else if (object instanceof  Rectangle2) {
            System.out.println("The rectangle area is " +
                    ((Rectangle2)object).getArea());
        }
    }
}
