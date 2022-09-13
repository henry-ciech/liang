package eu.ciechanowiec.liang.chapter07_tasks;

class Task_7_21 {

    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }

        System.out.printf("Sum: %.1f%n", sum);
    }
}

