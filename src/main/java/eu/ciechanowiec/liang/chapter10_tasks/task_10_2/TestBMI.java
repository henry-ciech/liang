package eu.ciechanowiec.liang.chapter10_tasks.task_10_2;

class TestBMI {

    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        BMI bmi2 = new BMI("Susan King", 215, 70);
        BMI bmi3 = new BMI("Herman", 28, 200, 6, 0); //Overweight :(

        System.out.printf("""
               BMI for %s is %.1f %s
               BMI for %s is %.1f %s
               BMI for %s is %.1f %s
               """, bmi1.getName(), bmi1.getBMI(), bmi1.getStatus(), bmi2.getName(), bmi2.getBMI(), bmi2.getStatus(),
                bmi3.getName(), bmi3.getBMI(), bmi3.getStatus());

    }
}
