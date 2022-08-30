package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Scanner;

class Task_6_37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width:");
        int width = scanner.nextInt();

        System.out.println("Enter number:");
        int number = scanner.nextInt();

        System.out.println(format(number,width));
    }

    private static StringBuilder format(int number, int width) {
        StringBuilder numberStr = new StringBuilder(String.valueOf(number));

        for (int i = numberStr.length(); i < width; i++) {
            numberStr.insert(0, "0");
        }

        return numberStr;
    }
}
