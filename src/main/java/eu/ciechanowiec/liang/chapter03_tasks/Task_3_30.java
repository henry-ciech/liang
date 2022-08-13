package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

public class Task_3_30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT:");
        int timeZone = scanner.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = (totalMinutes / 60);
        long currentHours = (totalHours + timeZone) % 12;

        System.out.println("Current time is: " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
    }
}
