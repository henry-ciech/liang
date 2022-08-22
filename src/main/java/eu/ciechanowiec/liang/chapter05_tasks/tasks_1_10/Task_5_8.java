package eu.ciechanowiec.liang.chapter05_tasks.tasks_1_10;

import java.util.Scanner;

class Task_5_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bestStudentsName = " ";
        double bestStudentsScore = -1;

        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter name for student #" + i + ": ");
            String name = scanner.next();

            System.out.print("Enter score for student #" + i + ": ");
            double score = scanner.nextDouble();

            if (score > bestStudentsScore) {
                bestStudentsScore = score;
                bestStudentsName = name;
            }
        }

        System.out.printf("""
                Best score: %.1f
                Best student's name: %s
                """, bestStudentsScore, bestStudentsName);
        }
    }

