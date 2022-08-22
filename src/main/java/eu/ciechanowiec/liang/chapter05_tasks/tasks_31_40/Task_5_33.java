package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

class Task_5_33 {

    public static void main(String[] args) {
        for (int number = 6; number <= 10000; number++) {
            int sum = 0;
            int divisor = number - 1;

            while (divisor > 0) {

                if (number % divisor == 0) {
                    sum += divisor;
                }
                divisor--;
            }
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
