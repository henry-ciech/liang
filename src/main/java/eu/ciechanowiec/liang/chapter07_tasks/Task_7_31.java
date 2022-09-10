package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_31 {

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

        System.out.println();

        System.out.print("List1: ");
        for (int number : list1) {
            System.out.printf("%d ", number);
        }
        System.out.println();

        System.out.print("List2: ");
        for (int number : list2) {
            System.out.printf("%d ", number);
        }
        System.out.println();

        int[] list3 = merge(list1, list2);
        
        System.out.println("The merged list is");
        for (int e: list3) {
            System.out.printf("%d ", e);
        }
        System.out.println();
    }
    
    private static int[] merge(int[] list1, int[] list2)  {
        int[] list3 = new int[list1.length + list2.length];

        System.arraycopy(list1, 0, list3, 0, list1.length);

        for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
            list3[j] = list2[i];
        }

        sort(list3);

        return list3;
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
