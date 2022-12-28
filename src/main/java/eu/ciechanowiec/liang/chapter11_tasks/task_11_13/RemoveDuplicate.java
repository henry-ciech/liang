package eu.ciechanowiec.liang.chapter11_tasks.task_11_13;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }

        removeDuplicateFromList(numbers);
        System.out.println();
        printArray(numbers);
    }

    private static void removeDuplicateFromList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (Objects.equals(list.get(i), list.get(j))) {
                    list.set(j, null);
                }
            }
        }
    }

    private static void printArray(ArrayList<?> list) {
        for (Object o : list) {
            if (o != null) {
                System.out.println(o);
            }
        }
    }
}
