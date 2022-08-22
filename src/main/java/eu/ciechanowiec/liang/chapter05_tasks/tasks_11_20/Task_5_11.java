package eu.ciechanowiec.liang.chapter05_tasks.tasks_11_20;

class Task_5_11 {

    public static void main(String[] args) {
        int numbersPerLine = 10;
        int count = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                count++;
                if (count % numbersPerLine == 0) {
                    System.out.printf("%d%n", i);
                } else {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
