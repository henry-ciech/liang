package eu.ciechanowiec.liang.chapter05_tasks.tasks_11_20;

class Task_5_19 {

    public static void main(String[] args) {

        String string = " ";

        int number = 0;
        for (int row = 0; row <= 7; row++)
        {
            for (int column = 1; column <= 7 - row; column++)
            {
                System.out.printf("%4s", string);
            }

            for (int column = 0; column <= row; column++)
            {
                number = (int) Math.pow(2, column);

                System.out.printf("%4d", number);
            }

            for (int column = row - 1; column >= 0; column--)
            {
                number = (int) Math.pow(2, column);

                System.out.printf("%4d", number);
            }
            System.out.println();
        }

        /* My version (works incorrectly)
        for (int i = 1; i <= 8; i++) {
            for (int k = 8; k >= i; k--){
                System.out.print("  ");
            }
            for (int l = 1; l < i + 1; l++) {
                System.out.printf("%4d", (int) Math.pow(l, 2));
            }
            for (int g = 9 - i, j = 8 - g; j >= 1; j--) {
                System.out.printf("%4d",(int) Math.pow(j, 2));
            }
            System.out.println();
        }*/
    }
}
