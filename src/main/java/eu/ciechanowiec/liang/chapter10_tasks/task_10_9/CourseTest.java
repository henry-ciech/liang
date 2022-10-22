package eu.ciechanowiec.liang.chapter10_tasks.task_10_9;

class CourseTest {

    public static void main(String[] args) {
        Course math = new Course("Math");
        math.addStudent("Mark");
        math.addStudent("Tom");
        math.addStudent("Joan");
        math.dropStudent("Tom");

        System.out.print("The students in the course " +
                math.getCourseName() + ": ");
        String[] students = math.getStudents();

        for (int i = 0; i < math.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
    }
}
