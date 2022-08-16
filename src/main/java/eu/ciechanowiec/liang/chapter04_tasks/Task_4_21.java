package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Scanner;

class Task_4_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a SSN:");
        String ssn = scanner.nextLine();

        if (String.valueOf(ssn.charAt(3)).equals("-")
                && String.valueOf(ssn.charAt(6)).equals("-")) {
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }
    }
}
