package eu.ciechanowiec.liang.chapter02_innercode;

import java.util.Scanner;

class Listing_2_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int secondsRemaining = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes +
                " minutes and " + secondsRemaining + " seconds ");
    }
}
