package eu.ciechanowiec.liang.chapter10_innercode.listing_10_5_6;

class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        String[] students = course1.getStudents();

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.printf("Number of students in course1: %d%n", course1.getNumberOfStudents());
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.printf("%s, ", students[i]);
        }

        System.out.println();
        System.out.printf("Number of students in course2: %d%n", course2.getNumberOfStudents());
    }
}
