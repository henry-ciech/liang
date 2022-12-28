package eu.ciechanowiec.liang.chapter11_tasks.task_11_17;

import java.util.ArrayList;
import java.util.Scanner;

class PerfectSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer m:");
        int numberM = scanner.nextInt();
        ArrayList<Integer> factors = getFactors(numberM);
        ArrayList<Integer> oddFactor = oddFactors(factors);
        printPerfectSquare(numberM, oddFactor);
    }

    private static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= number;) {
            if (number % i == 0) {
                factors.add(i);
                number /= i;
            } else {
                i++;
            }
        }
        return factors;
    }

    private static ArrayList<Integer> oddFactors(ArrayList<Integer> factors) {
        ArrayList<Integer> oddFactors = new ArrayList<>();
        ArrayList<Integer> evenFactors = new ArrayList<>();
        int numOfFactor = 1;
        for (int i = 0; i < factors.size(); i++) {
            Integer integer = factors.get(i);
            for (int j = i + 1; j < factors.size(); j++) {
                if (integer.equals(factors.get(j))) {
                    numOfFactor++;
                }
            }

            if (numOfFactor % 2 != 0 && !oddFactors.contains(integer) && !evenFactors.contains(integer)) {
                oddFactors.add(integer);
            } else {
                evenFactors.add(integer);
            }
            numOfFactor = 1;
        }

        return oddFactors;
    }

    private static void printPerfectSquare(int numberM, ArrayList<Integer> oddFactor) {
        int numberN = 1;
        for (Integer integer : oddFactor) {
            numberN *= integer;
        }

        System.out.printf("The smallest number n for m * n to be a perfect square is %d m * n is %d", numberN,
                numberM * numberN);
    }
}
