package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_2 {

    public static void main(String[] args) {
        System.out.println(sumDigit(25));
    }

    private static int sumDigit(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
