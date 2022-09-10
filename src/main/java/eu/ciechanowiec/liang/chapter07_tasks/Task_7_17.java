package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        String[] students = new String[scanner.nextInt()];
        int[] scores = new int[students.length];

        System.out.println("Enter the name a score for each student:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            students[i] = scanner.next();
            System.out.println("Score: ");
            scores[i] = scanner.nextInt();
        }

        sortDecreasing(students, scores);

        for (String student: students) {
            System.out.println(student);
        }
    }

    public static void sortDecreasing(String[] studentsNames, int[] studentScores) {
        for (int i = 0; i < studentScores.length; i++) {
            int max = studentScores[i];
            int maxIndex = i;
            String temp;

            for (int j = i + 1; j < studentScores.length; j++) {
                if (studentScores[j] > max) {
                    max = studentScores[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                temp = studentsNames[i];
                studentsNames[i] = studentsNames[maxIndex];
                studentsNames[maxIndex] = temp;

                studentScores[maxIndex] = studentScores[i];
                studentScores[i] = max;
            }
        }
    }
}
