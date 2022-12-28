package eu.ciechanowiec.liang.chapter11_tasks.task_11_5;

import java.util.ArrayList;

class Course2 {

    private final String courseName;
    private final ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    Course2(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    ArrayList<String> getStudents() {
        return students;
    }

    int getNumberOfStudents() {
        return numberOfStudents;
    }

    String getCourseName() {
        return courseName;
    }
}
