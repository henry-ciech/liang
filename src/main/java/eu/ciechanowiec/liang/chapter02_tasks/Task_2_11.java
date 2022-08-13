package eu.ciechanowiec.liang.chapter02_tasks;

import java.util.Scanner;

class Task_2_11 {
    private static final int presentPopulation = 312032486;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of years:");
        int days = 365 * scanner.nextInt();

        int seconds = 86400 * days;

        int peopleBorn = seconds / 7;
        int peopleDied = seconds / 13;
        int peopleImmigrate = seconds / 45;
        int plusPeopleFor5Years = peopleBorn + peopleImmigrate - peopleDied;
        int populationInGivenYears = presentPopulation + plusPeopleFor5Years;
        System.out.println("The population in 5 years is " + populationInGivenYears);
    }
}
