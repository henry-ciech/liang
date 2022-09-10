package eu.ciechanowiec.liang.chapter07_tasks;

import java.util.Scanner;

class Task_7_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score;
        double best = -1;
        char grade;

        System.out.println("Enter number of students:");
        int numOfStudents = scanner.nextInt();
        double[] scores = new double[numOfStudents];

        System.out.printf("Enter %d scores:%n", numOfStudents);

        for (int i = 0; i < numOfStudents; i++) {
            score = scanner.nextDouble();
            scores[i] = score;

            if (score > best) {
                best = score;
            }
        }

        for (int i = 0; i < numOfStudents; i++) {
            if (scores[i] == best) {
                grade = 'A';
            } else if (scores[i] >= best - 10) {
                grade = 'A';
            } else if (scores[i] >= best - 20) {
                grade = 'B';
            } else if (scores[i] >= best - 30) {
                grade = 'C';
            } else if (scores[i] >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.printf("Student #%d score is %.1f and grade is %c%n", i + 1, scores[i], grade);
        }
    }
}
