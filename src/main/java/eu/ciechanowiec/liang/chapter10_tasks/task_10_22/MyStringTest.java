package eu.ciechanowiec.liang.chapter10_tasks.task_10_22;

class MyStringTest {

    public static void main(String[] args) {
        char[] test1 = {'T', 'e', 'S', 't'};
        char[] test2 = {'T', 'e', 'S', 't', '2'};

        MyString myString = new MyString(test1);
        MyString myString2 = new MyString(test2);

        System.out.printf("Char at index 2 int test1: %c%n", myString.charAt(2));
        System.out.printf("Length of test2: %d%n", myString2.length());
        System.out.print("Substring of test2 form 1 to 3: ");
        MyString subStr = myString2.substring(1, 3);
        for (int i = 0; i < subStr.length(); i++) {
            System.out.print(subStr.charAt(i) + " ");
        }

        System.out.println();

        System.out.print("Test2 to lower case: ");
        MyString lowerCase = myString2.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            System.out.print(lowerCase.charAt(i) + " ");
        }

        System.out.printf("%nTest1 equal test2: %b%n", myString.equals(myString2));

        MyString valueOf = MyString.valueOf(23);
        System.out.print("String value of 23: ");
        for (int i = 0; i < valueOf.length(); i++) {
            System.out.print(valueOf.charAt(i));
        }

        System.out.println();
    }
}
