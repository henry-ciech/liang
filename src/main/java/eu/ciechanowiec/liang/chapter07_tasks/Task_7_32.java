package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list size:");
        int size = input.nextInt();
        int[] list = new int[size];

        System.out.print("Enter a list, first number - pivot:");

        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        partition(list);

        for (int j : list) {
            System.out.printf("%d ", j);
        }
    }

    public static void partition(int[] list) {
        int first = 0;
        int low = first + 1;
        int high = list.length - 1;
        int pivot = list[first];

        while (high > low) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }
            while (low <= high && list[high] > pivot) {
                high--;
            }

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high >= low && list[high] >= pivot) {
            high--;
        }

        if (high > first) {
            int temp = list[high];
            list[high] = list[first];
            list[first] = temp;
        }
    }
}
