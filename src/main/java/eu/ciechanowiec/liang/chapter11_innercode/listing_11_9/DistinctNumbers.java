package eu.ciechanowiec.liang.chapter11_innercode.listing_11_9;

import java.util.ArrayList;
import java.util.Scanner;

class DistinctNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (input ends with 0):");
        do {
            value = scanner.nextInt();
            if (!list.contains(value) && value != 0) {
                list.add(value);
            }
        } while (value != 0);

        System.out.println("The distinct integers are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }
}
