package eu.ciechanowiec.liang.chapter05_tasks.tasks_11_20;

class Task_5_13 {

    public static void main(String[] args) {
        int number = 0;
        int largestNumber = 0;

        while (number < 12_000) {
            if (Math.pow(number, 3) < 12_000) {
                largestNumber = number;
            }
            number++;
        }
        System.out.printf("The largest number that is smaller than 12,000 in a pow 3 is %d%n", largestNumber);
    }
}
