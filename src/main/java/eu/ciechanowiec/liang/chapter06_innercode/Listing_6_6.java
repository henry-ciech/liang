package eu.ciechanowiec.liang.chapter06_innercode;

import java.util.Scanner;

class Listing_6_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
         int n2 = scanner.nextInt();

        System.out.printf("The greatest common divisor for %d ans %d is %d%n", n1, n2, gcd(n1, n2));
    }

    static int gcd(int n1, int n2){
        int gcd = 1;
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }

        return gcd;
    }
}
