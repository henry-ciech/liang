package eu.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value for feet");
        double foot = scanner.nextDouble();

        double meters = foot * 0.305;
        System.out.println(foot + " feet is " + meters + " meters");
    }
}
