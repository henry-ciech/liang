package eu.ciechanowiec.liang.chapter05_tasks.tasks_1_10;

class Task_5_6 {

    public static void main(String[] args) {
        System.out.println("   Miles    Kilometers  |      Kilometers   Miles");

        for (int i = 1, j = 20; i <= 10; i++, j+=5) {
            System.out.printf("%4d       %6.3f       |      ", i, i * 1.609);
            System.out.printf("%d            %.3f%n", j, j / 1.609);
        }
    }
}
