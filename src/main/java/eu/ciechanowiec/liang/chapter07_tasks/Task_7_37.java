package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Task_7_37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] leftOrRight = new String[7];

        System.out.println("Enter the number of balls to drop:");
        int ballsToDrop = scanner.nextInt();

        System.out.println("Enter the number of slots in the bean machine:");
        int numberOfSlots = scanner.nextInt();
        int[] slotCount = new int[numberOfSlots];

        for (int i = 0; i < ballsToDrop; i++) {
            leftOrRightSimulation(leftOrRight, slotCount);
            for (String s : leftOrRight) {
                System.out.print(s);
            }
            System.out.println();
        }

        printArray(slotCount, ballsToDrop);
        System.out.println();
    }

    private static void leftOrRightSimulation(String[] leftOrRight, int[] slotCount) {
        RandomGenerator random = new Random();
        int number;
        int countR = 0;

        for (int i = 0; i < leftOrRight.length; i++) {
            number = random.nextInt(3);

            if (number == 0) {
                leftOrRight[i] = "L";
            } else {
                leftOrRight[i] = "R";
                countR++;
            }
        }
        slotCount[countR]++;
    }


    private static void printArray(int[] slots, int numberOfBalls) {

        while (!isEmpty(slots)) {
            if (isRowEmpty(slots, numberOfBalls)) {
                numberOfBalls--;
                continue;
            }

            for (int i = 0; i < slots.length; i++) {
                if (slots[i] >= numberOfBalls) {
                    System.out.print("0");
                    slots[i]--;
                }else {
                    System.out.print(" ");
                }
            }
            numberOfBalls--;
            System.out.println("");

        }
    }

    private static boolean isEmpty(int[] slots) {
        for (int slot : slots) {
            if (slot != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRowEmpty(int[] slots, int rowNum) {
        for (int slot : slots) {
            if (slot == rowNum) {
                return false;
            }
        }
        return true;
    }
}
