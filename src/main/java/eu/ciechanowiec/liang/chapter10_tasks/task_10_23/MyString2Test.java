package eu.ciechanowiec.liang.chapter10_tasks.task_10_23;

class MyString2Test {

    public static void main(String[] args) {
        String herman = "HeRmAn CIEchanowiec";
        String henryk = "henryk ciechanowiec";
        char[] hermanChar = herman.toCharArray();
        char[] henrykChar = henryk.toCharArray();


        MyString2 myString1 = new MyString2(hermanChar);

        System.out.println("test compare to \"henryk ciechanowiec\": " +
                myString1.compare(henrykChar));

        MyString2 upperCase = myString1.toUpperCase();
        System.out.print("test to upper case: ");
        print(upperCase.toChars());

        char[] chars = myString1.toChars();
        System.out.print("test in chars: ");
        print(chars);

        MyString2 trueOrFalse = MyString2.valueOf(true);
        System.out.print("MyString value of true: ");
        trueOrFalse.printChar();
        System.out.println();
    }

    static void print(char[] chars) {
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        System.out.println();
    }
}
