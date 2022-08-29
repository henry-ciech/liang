package eu.ciechanowiec.liang.chapter05_tasks.tasks_11_20;

class Task_5_18 {

    public static void main(String[] args) {

        System.out.println("Pattern A"); //Pattern A

        for (int i = 1; i <= 6; i++)    {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern B"); //Pattern B

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.printf("%n");
        }

        System.out.println("\nPattern C"); //Pattern C

        for (int i = 6; i >= 1; i--) {
            for (int k = 1; k <= i - 1; k++){
                System.out.print("  ");
            }
            for (int j = 7 - i; j >= 1; j--) {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }

        System.out.println("\nPattern D"); //Pattern D

        for (int i = 1; i <= 6; i++) {

            for (int l = 1; l <= 7 - i; l++) {
                System.out.printf("%d ", l);
            }

            System.out.printf("%n");
        }
    }
}
