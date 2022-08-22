package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

class Task_5_35 {

    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 624; i ++) {
            sum += 1 / Math.sqrt(i) + Math.sqrt(i + 1);
        }
        System.out.printf("%.2f%n", sum);
    }
}
