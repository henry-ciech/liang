package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Scanner;

public class Task_3_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter today's day:");
        int todayDay = scanner.nextInt();

        System.out.println("Enter the number of days elapsed since today:");
        int daysElapsed = scanner.nextInt();
        int futureDay = todayDay + daysElapsed;

        switch (todayDay) {
            case 0 -> System.out.print("Today is Sunday ");
            case 1 -> System.out.print("Today is Monday");
            case 2 -> System.out.print("Today is Tuesday");
            case 3 -> System.out.print("Today is Wednesday");
            case 4 -> System.out.print("Today is Thursday");
            case 5 -> System.out.print("Today is Friday");
            case 6 -> System.out.print("Today is Saturday");
            default -> throw new RuntimeException("Invalid input");
        }

        switch (futureDay % 7) {
            case 0 -> System.out.println(" and the future day is Sunday ");
            case 1 -> System.out.println(" and the future day is Monday");
            case 2 -> System.out.println(" and the future day is Tuesday");
            case 3 -> System.out.println(" and the future day is Wednesday");
            case 4 -> System.out.println(" and the future day is Thursday");
            case 5 -> System.out.println(" and the future day is Friday");
            case 6 -> System.out.println(" and the future day is Saturday");
            default -> throw new RuntimeException("Invalid input");
        }
    }
}
