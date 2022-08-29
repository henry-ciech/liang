package eu.ciechanowiec.liang.chapter05_tasks.tasks_21_30;

class Task_5_26 {

    public static void main(String[] args) {
        double item = 1.0;
        double e = 1.0;

        for (double i = 1; i <= 20; i++) {
            item +=  1.0 / i * (i - 1.0) * item;
            e += item;
        }

        System.out.printf("e: %.16f%n", e);
    }
}
