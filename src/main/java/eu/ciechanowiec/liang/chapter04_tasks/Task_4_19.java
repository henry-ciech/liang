package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first 9 digit of an ISBN as integers:"); //013031199 or 013031997
        String number = scanner.nextLine();
        System.out.println(number);

        int d1 = Integer.parseInt(String.valueOf(number.charAt(0)));
        int d2 = Integer.parseInt(String.valueOf(number.charAt(1)));
        int d3 = Integer.parseInt(String.valueOf(number.charAt(2)));
        int d4 = Integer.parseInt(String.valueOf(number.charAt(3)));
        int d5 = Integer.parseInt(String.valueOf(number.charAt(4)));
        int d6 = Integer.parseInt(String.valueOf(number.charAt(5)));
        int d7 = Integer.parseInt(String.valueOf(number.charAt(6)));
        int d8 = Integer.parseInt(String.valueOf(number.charAt(7)));
        int d9 = Integer.parseInt(String.valueOf(number.charAt(8)));

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (d10 == 10) {
            System.out.printf("%d%d%d%d%d%d%d%d%dX", d1, d2, d3, d4, d5, d6, d7, d8, d9);
        } else {
            System.out.printf("%d%d%d%d%d%d%d%d%d%d", d1, d2, d3, d4, d5, d6, d7, d8, d9, d10);
        }
    }
}
