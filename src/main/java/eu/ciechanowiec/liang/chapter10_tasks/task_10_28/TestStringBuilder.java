package eu.ciechanowiec.liang.chapter10_tasks.task_10_28;

class TestStringBuilder {

    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder("HeRmAn CIEchanowiec");

        MyStringBuilder build1 = builder.insert(2, new MyStringBuilder("nie"));

        System.out.print("Insert \"nie\": ");
        print(build1.getWord());

        MyStringBuilder reverse = builder.reverse();

        System.out.print("Reverse: ");
        print(reverse.getWord());

        MyStringBuilder upperCase = builder.toUpperCase();

        System.out.print("Upper case: ");
        print(upperCase.getWord());
    }

    static void print(char[] chars) {
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        System.out.println();
    }
}
