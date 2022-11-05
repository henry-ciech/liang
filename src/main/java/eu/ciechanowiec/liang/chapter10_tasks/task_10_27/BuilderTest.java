package eu.ciechanowiec.liang.chapter10_tasks.task_10_27;

class BuilderTest {

    public static void main(String[] args) {
        String herman = "HeRmAn CIEchanowiec";
        String henryk = "henryk ciechanowiec";
        char[] hermanChar = herman.toCharArray();
        char[] henrykChar = henryk.toCharArray();

        MyStringBuilder builder = new MyStringBuilder(hermanChar);

        MyStringBuilder wiec = new MyStringBuilder(henrykChar);
        System.out.print("builder append \"wiec\": ");
        print(wiec.getWord());
        System.out.println();

        MyStringBuilder wiec2 = builder.append(new MyStringBuilder(henrykChar));
        System.out.print("builder append \"wiec\": ");
        print(wiec2.getWord());
        System.out.println();

        MyStringBuilder number = builder.append(3);
        System.out.print("builder append 3: ");
        print(number.getWord());
        System.out.println();

        MyStringBuilder lowerCase = builder.toLowerCase();
        System.out.print("builder lower case: ");
        print(lowerCase.getWord());
        System.out.println();
    }


    static void print(char[] chars) {
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        System.out.println();
    }
}
