package eu.ciechanowiec.liang.chapter05_tasks.tasks_31_40;

import java.util.Scanner;

class Task_5_37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryValue = "";

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        while (number >= 1) {
            if (number % 2 == 0) {
                binaryValue = "0" + binaryValue;
            } else {
                binaryValue = "1" + binaryValue;
            }
            number /= 2;
        }

        System.out.println(binaryValue);
    }
}
