package eu.ciechanowiec.liang.chapter11_innercode.listing_11_8;

import eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4.Circle2;

import java.util.ArrayList;

class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List size? " + cityList.size());
        System.out.println("The Miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is list empty?" + cityList.isEmpty());
        
        cityList.add("Xian");

        cityList.remove(1);

        System.out.println(cityList);

        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.println(cityList.get(i) + " ");
        }
        System.out.println();

        ArrayList<Circle2> list = new ArrayList<>();

        list.add(new Circle2(2));
        list.add(new Circle2(3));

        System.out.println("The area of the circle? " + list.get(0).getArea());
    }
}
