package eu.ciechanowiec.liang.chapter11_tasks.task_11_9;

import java.util.ArrayList;
import java.util.Scanner;

class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size n:");

        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        fill(array);
        print(array);

        System.out.println("The largest row index:");
        ArrayList<Integer> largestRow = largestRow(array);
        print(largestRow);

        System.out.println("The largest column index:");
        ArrayList<Integer> largestColumn = largestColumn(array);
        print(largestColumn);
    }

     private static void print(ArrayList<Integer> list) {
         for (Integer integer : list) {
             System.out.printf("%d ", integer);
         }
        System.out.println();
    }

    private static ArrayList<Integer> largestColumn(int[][] array) {
        ArrayList<Integer> index = new ArrayList<>();
        int[] count = new int[array.length];

        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == 1) {
                    count[j]++;
                }
            }
        }
        int max = max(count);
        getIndex(index, count, max);
        return index;
    }

    private static ArrayList<Integer> largestRow(int[][] array) {
        ArrayList<Integer> index = new ArrayList<>();
        int[] count = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[j][i] == 1) {
                    count[j]++;
                }
            }
        }
        int max = max(count);
        getIndex(index, count, max);
        return index;
    }

    private static int max(int[] ints) {
        int max = ints[0];

        for (int j : ints) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    private static void getIndex(ArrayList<Integer> list, int[] count, int number) {
        for (int i = 0; i < count.length; i++) {
            if (count[i] == number) {
                list.add(i);
            }
        }
    }

    private static void fill(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 2);
            }
        }
    }

    private static void print(int[][] array) {
        System.out.println("The random array is");

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
