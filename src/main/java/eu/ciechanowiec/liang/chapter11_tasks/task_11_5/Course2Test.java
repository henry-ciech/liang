package eu.ciechanowiec.liang.chapter11_tasks.task_11_5;

import java.util.ArrayList;

class Course2Test {

    public static void main(String[] args) {
        Course2 course1 = new Course2("Data Structures");
        Course2 course2 = new Course2("Database Systems");
        ArrayList<String> students = course1.getStudents();

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.printf("Number of students in course1: %d%n", course1.getNumberOfStudents());
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.printf("%s, ", students.get(i));
        }

        System.out.println();
        System.out.printf("Number of students in course2: %d%n", course2.getNumberOfStudents());
    }
}
