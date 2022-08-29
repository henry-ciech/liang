package eu.ciechanowiec.liang.chapter05_tasks.tasks_41_51;

import java.util.Scanner;

class Task_5_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checksum = 0;

        System.out.println("Enter the first 12 digits of an ISBN-13 as integers:"); //978013213080 or 978013213079
        String number = scanner.nextLine();

        for (int i = 0; i < 12; i++) {
            if ((i + 1) % 2 == 0) {
                checksum += (number.charAt(i) - '0') * 3;
            } else {
                checksum += number.charAt(i) - '0';
            }
        }

        checksum = 10 - checksum % 10;

        if (checksum == 10) {
            checksum = 0;
        }

        System.out.printf("The ISBN-13 number is %s%d%n", number, checksum);
    }
}
