package eu.ciechanowiec.liang.chapter05_tasks.tasks_21_30;

class Task_5_23 {

    public static void main(String[] args) {
        double sumLeftToRight = 0;
        double sumRightToLeft = 0;
        double difference;

        for (int i = 1; i <= 50000; i++) {
            sumLeftToRight += 1.0 / i;
        }

        for (int i = 50000; i >= 1; i--) {
            sumRightToLeft += 1.0 / i;
        }

        difference = sumLeftToRight - sumRightToLeft;

        System.out.printf("difference: %.20f%n", difference);
    }
}
