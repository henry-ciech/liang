package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_25 {

    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        String output = (isMarkovMatrix(matrix)) ? "It is a Markov matrix" : "It is not a Markov matrix";
        System.out.println(output);
    }

    private static boolean isMarkovMatrix(double[][] matrix) {
        boolean markovMatrix = true;
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            if (sum != 1) {
                markovMatrix = false;
                break;
            }
            sum = 0;
        }
        return markovMatrix;
    }
}
