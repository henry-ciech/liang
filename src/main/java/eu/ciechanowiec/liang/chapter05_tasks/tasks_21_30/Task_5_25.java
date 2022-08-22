package eu.ciechanowiec.liang.chapter05_tasks.tasks_21_30;

class Task_5_25 {

    public static void main(String[] args) {
        double pi1 = 1.0;
        double pi2 = 1.0;
        double pi3 = 1.0;

        for (int i = 2; i <= 100000; i++) { //for 10.000
            pi1 += Math.pow(-1 , i + 1) / (2 * i - 1.0D);

            if (i == 10000) {
                System.out.printf("i: %d%npi: %f%n", i, 4.0 * pi1);
                break;
            }
        }

        for (int i = 2; i <= 100000; i++) { //for 20.000
            pi2 += Math.pow(-1 , i + 1) / (2 * i - 1.0D);

            if (i == 20000) {
                System.out.printf("i: %d%npi: %f%n", i, 4.0 * pi2);
                break;
            }
        }

        for (int i = 2; i <= 100000; i++) { //for 100.000
            pi3 += Math.pow(-1 , i + 1) / (2 * i - 1.0D);

            if (i == 100000) {
                System.out.printf("i: %d%npi: %f%n", i, 4.0 * pi3);
                break;
            }
        }
    }
}
