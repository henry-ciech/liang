package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Random;
import java.util.random.RandomGenerator;

class Task_6_30 {

    public static void main(String[] args) {
        RandomGenerator random = new Random();
        int dice1;
        int dice2;
        int sum;
        int winValue1 = 7;
        int winValue2 = 11;
        int loseValue1 = 2;
        int loseValue2 = 3;
        int loseValue3 = 12;
        int loseValue4 = -1;

        while (true) {
            dice1 = random.nextInt(7);
            dice2 = random.nextInt(7);
            sum = dice1 + dice2;

            System.out.printf("You rolled %d + %d = %d%n", dice1, dice2, sum);

            if (sum == winValue1 || sum == winValue2) {
                System.out.println("You won");
                break;
            }

            if (sum == loseValue1
                    || sum == loseValue2
                    || sum == loseValue3
                    || sum == loseValue4) {
                System.out.println("You lost");
                break;
            } else {
                System.out.printf("Point is %d%n", sum);
                winValue1 = sum;
                loseValue4 = 7;
            }
        }
    }
}
