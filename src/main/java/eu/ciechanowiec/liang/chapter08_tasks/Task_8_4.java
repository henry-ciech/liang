package eu.ciechanowiec.liang.chapter08_tasks;

class Task_8_4 {

    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};

        int[][] hoursSum = new int[hours.length][2];
        for (int i = 0; i < hoursSum.length; i++) {
            hoursSum[i][0] = i;
            hoursSum[i][1] = sum(hours[i]);
        }

        sort(hoursSum);

        for (int i = 0; i < hoursSum.length; i++) {
            System.out.printf("Total hours fo employee %d is %d%n", hoursSum[i][0], hoursSum[i][1]);
        }
    }

    private static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int minCol1 = m[i][1];
            int minCol0 = m[i][0];
            int minIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (minCol1 < m[j][1]) {
                    minCol1 = m[j][1];
                    minCol0 = m[j][0];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                m[minIndex][1] = m[i][1];
                m[minIndex][0] = m[i][0];
                m[i][1] = minCol1;
                m[i][0] = minCol0;
            }
        }
    }

    private static int sum(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }
}
