package eu.ciechanowiec.liang.chapter05_tasks.tasks_1_10;

class Task_5_3 {

    public static void main(String[] args) {
        System.out.println("   Kilograms   Pounds");

        for (int i = 1; i < 200; i++) {
            System.out.printf("%4d            %4.2f%n", i, i * 2.2);
        }
    }
}
