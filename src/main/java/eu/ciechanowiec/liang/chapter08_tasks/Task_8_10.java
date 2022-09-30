package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Random;
import java.util.random.RandomGenerator;

class Task_8_10 {

    public static void main(String[] args) {
        RandomGenerator random = new Random();
        int[][] matrix = new int[4][4];
        int count = 0;
        int countRow = 0;
        int countColumn = 0;
        int largestRow = -1;
        int largestColumn = -1;
        int largestRowCount = -1;
        int largestColumnCount = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (count % 4 == 0) {
                    System.out.println();
                }
                System.out.printf("%d ", matrix[i][j]);
                count++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    countRow++;
                }
            }
            if (countRow > largestRowCount) {
                largestRow = i;
                largestRowCount = countRow;
            }
            countRow = 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 1) {
                    countColumn++;
                }
            }
            if (countColumn > largestColumnCount) {
                largestColumn = i;
                largestColumnCount = countColumn;
            }
            countColumn = 0;
        }

        System.out.printf("%nThe Largest row index: %d", largestRow);
        System.out.printf("%nThe Largest column index: %d%n", largestColumn);
    }
}
