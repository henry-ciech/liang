package eu.ciechanowiec.liang.chapter10_tasks.task_10_24;

class MyCharacterTest {

    public static void main(String[] args) {
        MyCharacter ch = new MyCharacter('L');

        System.out.println("ch: " + ch.getChar());
        System.out.println("Is a letter: " + ch.isLetter());
        System.out.println("Is a digit: " + ch.isDigit());
        System.out.println("L == L ? " + ch.equals(new MyCharacter('L')));
    }
}
