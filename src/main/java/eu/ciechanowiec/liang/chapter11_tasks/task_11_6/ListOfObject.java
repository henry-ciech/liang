package eu.ciechanowiec.liang.chapter11_tasks.task_11_6;

import eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4.Circle2;

import java.util.ArrayList;
import java.util.Date;

class ListOfObject {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Date());
        list.add("Hello World");
        list.add(new Circle2());

        for (Object o : list) {
            System.out.println(o);
            System.out.println();
        }
    }
}
