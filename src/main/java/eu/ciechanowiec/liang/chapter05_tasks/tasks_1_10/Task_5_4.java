package eu.ciechanowiec.liang.chapter05_tasks.tasks_1_10;

class Task_5_4 {

    public static void main(String[] args) {
        System.out.println("   Miles   Kilometers");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d     %.3f%n", i, i * 1.609);
        }
    }
}
