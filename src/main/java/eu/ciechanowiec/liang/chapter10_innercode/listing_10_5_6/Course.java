package eu.ciechanowiec.liang.chapter10_innercode.listing_10_5_6;

class Course {

    private String courseName;
    private String[] students = new String[1000];
    private int numberOfStudents;

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    String[] getStudents() {
        return students;
    }

    int getNumberOfStudents() {
        return numberOfStudents;
    }

    String getCourseName() {
        return courseName;
    }
}
