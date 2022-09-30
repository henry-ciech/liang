package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Random;
import java.util.random.RandomGenerator;

class Task_8_18 {

    public static void main(String[] args) {
        int count = 0;

        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}};

        shuffle(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (count % 2 == 0) {
                    System.out.printf("%n%d ", matrix[i][j]);
                } else {
                    System.out.printf("%d ", matrix[i][j]);
                }
                count++;
            }
        }

        System.out.println();
    }

    private static void shuffle(int[][] matrix) {
        RandomGenerator random = new Random();

        for (int i = matrix.length - 1; i > 0; i--) {
            for (int j = matrix[i].length - 1; j > 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);

                int temp = matrix[i][j];
                matrix[i][j] = matrix[m][n];
                matrix[m][n] = temp;
            }
        }
    }
}
