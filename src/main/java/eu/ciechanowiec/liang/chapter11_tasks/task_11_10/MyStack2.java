package eu.ciechanowiec.liang.chapter11_tasks.task_11_10;

import java.util.ArrayList;

class MyStack2 {

    private final ArrayList<Object> list = new ArrayList<>();

    boolean isEmpty() {
        return list.isEmpty();
    }

    int getSize() {
        return list.size();
    }
    Object peek() {
        return list.get(getSize() - 1);
    }
    Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    void push(Object o) {
        list.add(o);
    }

    void reverseList() {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
