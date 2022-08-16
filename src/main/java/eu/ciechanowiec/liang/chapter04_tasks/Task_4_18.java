package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two characters:");
        String majorAndStatus = scanner.nextLine();

        char major = majorAndStatus.toUpperCase().charAt(0);
        char status = majorAndStatus.charAt(1);

        switch (major) {
            case 'M' -> System.out.print("Mathematics ");
            case 'C' -> System.out.print("Computer Science ");
            case 'I' -> System.out.print("Information Technology ");
        }

        switch (status) {
            case '1' -> System.out.println("freshman");
            case '2' -> System.out.println("sophomore");
            case '3' -> System.out.println("junior");
            case '4' -> System.out.println("senior");
        }
    }
}
