package eu.ciechanowiec.liang.chapter09_tasks.task_9_13;

import java.util.Scanner;

class Max {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the array: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];

        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        Location max = locateLargest(array);
        System.out.printf("The location of the largest element is %.1f at (%d, %d)%n", max.maxValue, max.row, max.column);
    }

    static Location locateLargest(double[][] a) {
        return new Location(a);
    }
}
