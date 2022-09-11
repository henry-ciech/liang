package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_3 {
    public static void main(String[] args) {
        int[] counts = new int[100];

        System.out.println("Enter the integers between 1 and 100: ");

        count(counts);

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.printf("%d occurs %d time%s%n", i + 1, counts[i], (counts[i] > 1 ? "s" : ""));
            }
        }
    }

    private static void count(int[] counts){
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            num = scanner.nextInt();
            if (num >= 1 && num <= 100) {
                counts[num - 1]++;
            }
        } while (num != 0);
    }
}
