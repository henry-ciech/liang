package eu.ciechanowiec.liang.chapter08_tasks;

class Task_8_16 {

    public static void main(String[] args) {
        int count = 0;
        int[][] matrix = {
                {4, 2},
                {1, 7},
                {4, 5},
                {1, 2},
                {1, 1},
                {4, 1},
        };

        sort(matrix);

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (count % 2 == 0) {
                    System.out.printf("%n%d ", anInt);
                } else {
                    System.out.printf("%d ", anInt);
                }

                count++;
            }
        }
    }

    private static void sort(int[][] matrix) {
        int[] min = new int[2];
        for (int row = 0; row < matrix.length - 1; row++) {
            min[0] = matrix[row][0];
            min[1] = matrix[row][1];
            int index = row;
            for (int i = row + 1; i < matrix.length; i++) {
                if (matrix[i][0] <= min[0] && (matrix[i][0] < min[1] ||
                        matrix[i][1] < min[0] || matrix[i][1] < min[1])) {
                    min[0] = matrix[i][0];
                    min[1] = matrix[i][1];
                    index = i;
                }
            }
            if (index != row){
                matrix[index][0] = matrix[row][0];
                matrix[index][1] = matrix[row][1];
                matrix[row][0] = min[0];
                matrix[row][1] = min[1];
            }
        }
    }
}