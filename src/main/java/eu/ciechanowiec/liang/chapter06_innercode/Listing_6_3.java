package eu.ciechanowiec.liang.chapter06_innercode;

class Listing_6_3 {

    public static void main(String[] args) {
        System.out.printf("The grade is %c%n", getGrade(78.5));

        System.out.printf("The grade is %c%n", getGrade(59.5));
    }

    private static char getGrade(double score) {
        if (score >= 90.0) {
            return 'A';
        } else if (score >= 80.0) {
            return 'B';
        } else if (score >= 70.0) {
            return 'C';
        } else if (score >= 60.0) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
