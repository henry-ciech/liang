package eu.ciechanowiec.liang.chapter11_tasks.task_11_4;

import java.util.ArrayList;
import java.util.Scanner;

class MaxValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int number;

        System.out.println("Enter ArrayList(input ends with 0):");
        do {
            number = scanner.nextInt();
            list.add(number);
        } while (number != 0);

        System.out.printf("max value: %d%n", max(list));
    }

    private static Integer max(ArrayList<Integer> list) {
        int maxvalue = list.get(0);

        if (list.size() == 1) {
            return null;
        } else {
            for (int i = 1; i < list.size() - 1; i++) {
                if (list.get(i) > maxvalue) {
                    maxvalue = list.get(i);
                }
            }
            return maxvalue;
        }
    }
}
