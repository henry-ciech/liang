package eu.ciechanowiec.liang.chapter10_tasks.task_10_9;

class Course {

    private final String courseName;
    private String[] students = new String[1];
    private int numberOfStudents;

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] array = new String[students.length + 1];
            System.arraycopy(students, 0, array, 0, numberOfStudents);
            students = array;
        }
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

    void dropStudent(String student) {
        int index = findStudent(student);
        if (index >= 0) {
            dropStudent(index);
        } else {
            System.out.println(student + " is not in the course: " + courseName);
        }
    }

    void dropStudent(int index) {
        String[] array = new String[students.length - 1];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i == index) {
                j++;
            }
            array[i] = students[j];
        }
        this.students = array;
        numberOfStudents--;
    }

    void clear() {
        students = new String[1];
        numberOfStudents = 0;
    }

    private int findStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }
}
