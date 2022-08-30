package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_16 {

    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("Number of days in %d is %d%n", i, numberOfDaysInAYear(i));
        }
    }

    private static int numberOfDaysInAYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return 366;
        } else {
            return 365;
        }
    }
}
