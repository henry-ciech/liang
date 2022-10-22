package eu.ciechanowiec.liang.chapter10_tasks.task_10_23;

class MyString2Test {

    public static void main(String[] args) {

        MyString2 myString1 = new MyString2("HeRmAn CIEchanowiec");

        System.out.println("test compare to \"henryk ciechanowiec\": " +
                myString1.compare("henryk ciechanowiec"));

        MyString2 subStr = myString1.substring(7);
        System.out.println("test subString from7: " + subStr.printWord());

        MyString2 upperCase = myString1.toUpperCase();
        System.out.println("test to upper case: " + upperCase.printWord());

        char[] chars = myString1.toChars();
        System.out.print("test in chars: ");
        print(chars);

        MyString2 trueOrFalse = MyString2.valueOf(true);
        System.out.println("MyString value of true: " + trueOrFalse.printWord());
    }

    static void print(char[] chars) {
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        System.out.println();
    }
}
