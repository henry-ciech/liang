package eu.ciechanowiec.liang.chapter11_innercode.listing_11_5;

import eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4.Circle2;
import eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4.GeometricObject;
import eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4.Rectangle2;

public class PolymorphismDemo {

    public static void main(String[] args) {
        displayObject(new Circle2(1, "red", false));
        displayObject(new Rectangle2(1, 1, "black", true));
    }

    static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
