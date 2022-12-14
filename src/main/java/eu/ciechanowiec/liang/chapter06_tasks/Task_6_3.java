package eu.ciechanowiec.liang.chapter06_tasks;

class Task_6_3 {

    public static void main(String[] args) {
        System.out.println(reverse(121));
        System.out.println(isPalindrome(121));
    }

    private static int reverse(int number) {
        StringBuilder input = new StringBuilder();

        input.append(number);
        input.reverse();

        return Integer.parseInt(String.valueOf(input));
    }

    private static boolean isPalindrome(int number) {
        StringBuilder input = new StringBuilder();

        input.append(number);
        input.reverse();

        int reverseNumber = Integer.parseInt(String.valueOf(input));

        return number == reverseNumber;
    }
}
