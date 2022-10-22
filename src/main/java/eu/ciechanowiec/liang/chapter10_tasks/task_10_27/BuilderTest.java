package eu.ciechanowiec.liang.chapter10_tasks.task_10_27;

class BuilderTest {

    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder("HeRmAn CIEchaNO");

        MyStringBuilder wiec = new MyStringBuilder("wiec");
        System.out.println("builder append \"wiec\": " + builder.getBuild() + wiec.getBuild());

        MyStringBuilder number = new MyStringBuilder("");

        MyStringBuilder wiec2 = builder.append(new MyStringBuilder("wiec"));
        System.out.println("builder append \"wiec\": " + wiec2.getBuild());
    }
}
