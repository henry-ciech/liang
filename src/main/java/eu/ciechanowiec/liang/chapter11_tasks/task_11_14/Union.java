package eu.ciechanowiec.liang.chapter11_tasks.task_11_14;

import java.util.ArrayList;
import java.util.Scanner;

class Union {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Enter 5 numbers for list1:");
        for (int i = 0; i < 5; i++) {
            list1.add(scanner.nextInt());
        }

        System.out.println("Enter 5 numbers for list2:");
        for (int i = 0; i < 5; i++) {
            list2.add(scanner.nextInt());
        }

        ArrayList<Integer> union = union(list1, list2);
        printArray(union);
    }
    private static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> unionList = new ArrayList<>();

        unionList.addAll(list1);
        unionList.addAll(list2);

        return unionList;
    }

    private static void printArray(ArrayList<?> list) {
        for (Object number : list) {
            System.out.print(number + " ");
        }
    }
}
