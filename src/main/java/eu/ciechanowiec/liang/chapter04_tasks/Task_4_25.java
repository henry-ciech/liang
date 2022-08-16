package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Task_4_25 {

    public static void main(String[] args) {
        RandomGenerator random = new Random();
        int letter1 = random.nextInt(26) + 65;
        int letter2 = random.nextInt(26) + 65;
        int letter3 = random.nextInt(26) + 65;
        int digit1 = random.nextInt(10);
        int digit2 = random.nextInt(10);
        int digit3 = random.nextInt(10);
        int digit4 = random.nextInt(10);

        char ch1 = (char) letter1;
        char ch2 = (char) letter2;
        char ch3 = (char) letter3;

        System.out.println("Plate number: " + ch1 + ch2 + ch3 + digit1 + "" + digit2 + "" + digit3 + "" + digit4);
    }
}
