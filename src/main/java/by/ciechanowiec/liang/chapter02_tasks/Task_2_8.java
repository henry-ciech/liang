package by.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT");
        int timeZone = scanner.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = (totalMinutes / 60);
        long currentHours = totalHours % 24 + timeZone;

        System.out.println("Current time is: " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
    }
}
