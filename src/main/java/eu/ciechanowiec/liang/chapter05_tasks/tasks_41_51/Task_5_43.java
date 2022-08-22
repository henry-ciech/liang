package eu.ciechanowiec.liang.chapter05_tasks.tasks_41_51;

class Task_5_43 {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                System.out.printf("%d %d%n", i, j);
                count++;
            }
        }

        System.out.printf("The total umber of combinations: %d", count);
    }
}
