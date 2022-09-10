package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list1: ");
        int[] list1 = new int[scanner.nextInt()];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = scanner.nextInt();
        }

        System.out.println("Enter list2: ");
        int[] list2 = new int[scanner.nextInt()];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = scanner.nextInt();
        }

        System.out.printf("Two lists are%s strictly identical%n", equals(list1, list2) ? "" : " not");
    }

    private static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        sort(list1);
        sort(list2);

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

    private static void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
}
