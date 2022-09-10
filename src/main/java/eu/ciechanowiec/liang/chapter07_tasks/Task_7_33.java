package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
                "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println(zodiacs[year % 12]);
    }
}
