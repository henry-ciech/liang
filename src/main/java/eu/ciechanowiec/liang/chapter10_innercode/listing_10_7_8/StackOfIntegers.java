package eu.ciechanowiec.liang.chapter10_innercode.listing_10_7_8;

public class StackOfIntegers {

    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }

    StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    int peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }
}
