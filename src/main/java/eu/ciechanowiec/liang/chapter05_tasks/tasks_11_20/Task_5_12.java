package eu.ciechanowiec.liang.chapter05_tasks.tasks_11_20;

class Task_5_12 {

    public static void main(String[] args) {
        int number = 0;

        while (number < 12_000) {
            if (Math.pow(number, 2) > 12_000) {
                System.out.printf("The smallest number that is bigger than 12,000 in a pow 2 is %d%n", number);
                break;
            }

            number++;
        }
    }
}
