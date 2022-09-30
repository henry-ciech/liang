package eu.ciechanowiec.liang.chapter08_tasks;

class Task_8_3 {

    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] correctCounts = new int[answers.length][2];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCounts[i][0] = i;
                    correctCounts[i][1]++;
                }
            }
        }

        sort(correctCounts);

        for (int[] count : correctCounts) {
            System.out.printf("Student %d's correct count is %d%n", count[0], count[1]);
        }
    }

    private static void sort(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int minCol1 = numbers[i][1];
            int minCol0 = numbers[i][0];
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (minCol1 > numbers[j][1]) {
                    minCol1 = numbers[j][1];
                    minCol0 = numbers[j][0];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                numbers[minIndex][1] = numbers[i][1];
                numbers[minIndex][0] = numbers[i][0];
                numbers[i][1] = minCol1;
                numbers[i][0] = minCol0;
            }
        }
    }
}
