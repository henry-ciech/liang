package eu.ciechanowiec.liang.chapter11_tasks.task_11_11;

import java.util.ArrayList;
import java.util.Scanner;

class SortList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }

        sort(numbers);
        System.out.println("sorted array:");
        printArray(numbers);
    }

    private static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int tmp;
                if (list.get(i) > list.get(j)) {
                    tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
    }

    private static void printArray(ArrayList list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
