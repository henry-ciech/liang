package eu.ciechanowiec.liang.chapter03_tasks;

import java.util.Random;

class Task_3_16 {

    public static void main(String[] args) {
        Random random = new Random();

        int xCord = random.nextInt(100 + 100) - 100;
        int yCord = random.nextInt(50 + 50) - 50;

        System.out.println("(" + xCord + " " + yCord + ")");
    }
}
