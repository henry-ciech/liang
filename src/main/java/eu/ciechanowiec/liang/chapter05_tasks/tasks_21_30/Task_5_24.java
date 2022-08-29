package eu.ciechanowiec.liang.chapter05_tasks.tasks_21_30;

class Task_5_24 {

    public static void main(String[] args) {
        double sum = 0;

        for (double i = 1; i <= 97; i+=2) {
            for (double j = i + 2; j == i + 2; j++) {
                sum += i / j;
            }
        }

        System.out.printf("Total: %.3f%n", sum);

        //OR

        double total = 0.0;
        for (int k = 1; k <= 97; k += 2) {
            total += (double) k / (k + 2);
        }
        System.out.printf("Total: %.3f%n", total);
    }
}

