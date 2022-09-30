package eu.ciechanowiec.liang.chapter08_tasks;

import java.util.Scanner;

class Task_8_36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int number = scanner.nextInt();
        char[][] chars = new char[number][number];
        int maxLetter = 65 + number;

        System.out.printf("Enter %d rows of letters separated by spaces:%n", number);
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                chars[i][j] = scanner.next().charAt(0);
            }
        }

        maxLetter--;
        String output = (check(chars, maxLetter))? "The input array is a Latin square" :
                "Wrong input: the letters must be from " + (char) 65 + " to " + (char) maxLetter ;
        System.out.println(output);
    }
    private static boolean check(char[][] matrix, int maxLetter) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxLetter) {
                    return false;
                }
            }
        }
        return true;
    }
}
