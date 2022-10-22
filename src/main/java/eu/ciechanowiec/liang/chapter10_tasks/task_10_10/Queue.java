package eu.ciechanowiec.liang.chapter10_tasks.task_10_10;

class Queue {

    private int[] elements;
    private int size;

    Queue() {
        elements = new int[8];
    }

    boolean empty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }

    void enqueue(int number) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = number;
        size++;
    }

    int dequeue() {
        int[] temp = new int[elements.length - 1];
        int returnVal = elements[0];
        System.arraycopy(elements, 1, temp, 0, elements.length - 1);
        elements = temp;
        size--;
        return returnVal;
    }
}
