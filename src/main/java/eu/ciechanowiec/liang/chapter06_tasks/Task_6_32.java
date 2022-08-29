package eu.ciechanowiec.liang.chapter06_tasks;

import java.util.Random;
import java.util.random.RandomGenerator;

class Task_6_32 {

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
        int winGames = 0;

        for (int i = 1; i <= 10000; i++) {
            while (true) {
                dice1 = random.nextInt(7);
                dice2 = random.nextInt(7);
                sum = dice1 + dice2;

                if (sum == winValue1 || sum == winValue2) {
                    winGames++;
                    break;
                }

                if (sum == loseValue1
                        || sum == loseValue2
                        || sum == loseValue3
                        || sum == loseValue4) {
                    break;
                } else {
                    winValue1 = sum;
                    loseValue4 = 7;
                }
            }
        }

        System.out.printf("Win games: %d%n", winGames);
    }
}
