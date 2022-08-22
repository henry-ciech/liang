package eu.ciechanowiec.liang.chapter05_tasks.tasks_1_10;

import java.util.Scanner;

class Task_5_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bestStudentsName = null;
        double bestStudentsScore = -1;
        String secondName = null;
        double secondScore = -1;

        System.out.print("Enter the number of student: ");
        int numberOfStudents = input.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter name for student #" + i + ": ");
            String name = input.next();

            System.out.print("Enter score for student #" + i + ": ");
            double score = input.nextDouble();

            if (score > bestStudentsScore) {
                if (bestStudentsName != null) {
                    secondName = bestStudentsName;
                    secondScore = bestStudentsScore;
                }
                bestStudentsName = name;
                bestStudentsScore = score;
            } else if (score > secondScore) {
                secondName = name;
                secondScore = score;
            }

        }
        System.out.printf("""
                Best score: %.1f
                Best student's name: %s
                """, bestStudentsScore, bestStudentsName);
        System.out.printf("""
                Second score: %.1f
                Second student's name: %s
                """, secondScore, secondName);
    }
}
