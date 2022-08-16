package eu.ciechanowiec.liang.chapter04_tasks;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Task_4_16 {

    public static void main(String[] args) {
        RandomGenerator random = new Random();
        int letterNumber = random.nextInt(26) + 65;

        char letter = (char) letterNumber;

        System.out.println(letter);
    }
}
