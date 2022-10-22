package eu.ciechanowiec.liang.chapter10_tasks.task_10_10;

class QueueTest {

    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 0; i < 20; i++) {
            queue.enqueue(i + 1);
        }

        int queueSize = queue.getSize();

        System.out.println("Values in the queue are: ");
        for (int j = 0; j < queueSize; j++) {
            System.out.printf("Value %d is: %d%n", j + 1, queue.dequeue());
        }
    }
}
