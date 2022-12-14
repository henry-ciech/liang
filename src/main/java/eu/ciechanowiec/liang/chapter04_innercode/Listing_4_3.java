package eu.ciechanowiec.liang.chapter04_innercode;

import java.util.Scanner;

class Listing_4_3 {

    private static final String YES_NO = """
                                   0 - no
                                   1 - yes
                                   """;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;

        String set1 = """
                1 3 5 7
                9 11 13 15
                17 19 21 23
                25 27 29 31
                """;

        String set2 = """
                2 3 6 7
                10 11 14 15
                18 19 22 23
                26 27 30 31
                """;

        String set3 = """
                4 5 6 7
                12 13 14 15
                20 21 22 23
                28 29 30 31
                """;

        String set4 = """
                8 9 10 11
                12 13 14 15
                24 25 26 27
                28 29 30 31
                """;

        String set5 = """
                16 17 18 19
                20 21 22 23
                24 25 26 27
                28 29 30 31
                """;

        System.out.println("Is your birthday in Set1?");
        System.out.println(set1);
        System.out.println(YES_NO);
        int answer = scanner.nextInt();

        if (answer == 1) {
            day += 1;
        }

        System.out.println("Is your birthday in Set2?");
        System.out.println(set2);
        System.out.println(YES_NO);
        answer = scanner.nextInt();

        if (answer == 1) {
            day += 2;
        }

        System.out.println("Is your birthday in Set3?");
        System.out.println(set3);
        System.out.println(YES_NO);
        answer = scanner.nextInt();

        if (answer == 1) {
            day += 4;
        }

        System.out.println("Is your birthday in Set4?");
        System.out.println(set4);
        System.out.println(YES_NO);
        answer = scanner.nextInt();

        if (answer == 1) {
            day += 8;
        }

        System.out.println("Is your birthday in Set5?");
        System.out.println(set5);
        System.out.println(YES_NO);
        answer = scanner.nextInt();

        if (answer == 1) {
            day += 16;
        }

        System.out.println("Your birthday is " + day + "!");
    }
}
