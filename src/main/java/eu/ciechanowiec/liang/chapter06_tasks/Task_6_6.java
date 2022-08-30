package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_6 {

    public static void main(String[] args) {
        displayPattern(8);
    }

    private static void displayPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= i - 1; k++){
                System.out.print("  ");
            }
            for (int j = (n + 1) - i; j >= 1; j--) {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}
