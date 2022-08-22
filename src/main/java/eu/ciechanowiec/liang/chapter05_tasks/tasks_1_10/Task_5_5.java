package eu.ciechanowiec.liang.chapter05_tasks.tasks_1_10;

class Task_5_5 {

    public static void main(String[] args) {
        System.out.println("   Kilograms Pounds   Pounds   Kilograms");

        for (int i = 1, j = 20; i < 200; i+=2, j+=5) {
            System.out.printf("%4d       %6.2f  |", i, i * 2.2);
            System.out.printf("  %d       %.2f%n", j, j / 2.2);
        }
    }
}
