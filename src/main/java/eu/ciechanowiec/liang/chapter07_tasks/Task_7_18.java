package eu.ciechanowiec.liang.chapter07_tasks;

class Task_7_18 {

    public static void main(String[] args) {
        double[] numbers = new double[100];

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Math.random() * 200;
        }

        bubbleSort(numbers);
        printArray(numbers);
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4.0f ", array[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println("");
            }
        }
    }

    private static void bubbleSort(double[] numbers) {
        boolean change;

        do {
            change = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    change = true;
                }
            }
        } while (change);
    }
}
