package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Arrays;
import java.util.Scanner;

class Task_8_28 {

    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter list2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        String output = (equals(matrix1, matrix2)) ? "The two arrays are strictly identical" :
                "The two arrays are not strictly identical";

        System.out.println(output);
    }

    private static boolean equals(int[][] matrix1, int[][] matrix2) {
        return Arrays.deepEquals(matrix1, matrix2);
    }
}
