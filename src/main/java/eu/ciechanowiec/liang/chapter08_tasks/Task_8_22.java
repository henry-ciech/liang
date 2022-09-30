package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Random;
import java.util.random.RandomGenerator;

class Task_8_22 {

    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        int numberOfOnesColumn = 0;
        int numberOfOnesRow = 0;
        int count = 1;
        boolean allEven = true;

        fillMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (count % 6 == 0) {
                    System.out.printf("%d%n", matrix[i][j]);
                } else {
                    System.out.printf("%d ", matrix[i][j]);
                }
                count++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    numberOfOnesRow++;
                }

                if (matrix[j][i] == 1) {
                    numberOfOnesColumn++;
                }
            }
            if (numberOfOnesColumn % 2 != 0 || numberOfOnesRow % 2 != 0) {
                allEven = false;
                break;
            }
            numberOfOnesColumn = 0;
            numberOfOnesRow = 0;
        }

        String output = (allEven)? "Even number of ones" : "Odd number of ones";

        System.out.println(output);
    }

    private static void fillMatrix(int[][] matrix) {
        RandomGenerator random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }
    }
}
