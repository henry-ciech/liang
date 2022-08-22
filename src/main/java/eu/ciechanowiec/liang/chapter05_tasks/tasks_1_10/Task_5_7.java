package eu.ciechanowiec.liang.chapter05_tasks.tasks_1_10;

class Task_5_7 {

    public static void main(String[] args) {
        double tuition10Years = 10_000;

        for (int i = 1; i <= 10; i++) {
            tuition10Years *= 1.05;
        }

        double tuition4Years = tuition10Years;

        for (int i = 1; i <= 4; i++) {
            tuition4Years *= 1.05;
        }

        System.out.printf("""
                Tuition in 10 years: %.2f
                Tuition in 4 years after 10 years: %.2f
                """, tuition10Years, tuition4Years);
    }
}
