package eu.ciechanowiec.liang.chapter10_tasks.task_10_23;

class MyString2 {

    private final char[] word;

    MyString2(char[] word) {
        this.word = new char[word.length];
        System.arraycopy(word, 0, this.word, 0, word.length);
    }

    int compare(char[] valueToCompare) {
        int index = 0;

        if (word.length < valueToCompare.length) {
            index = -1;
        }

        if (word.length > valueToCompare.length) {
            index = 1;
        }

        for (int i = 0; i < word.length; i++) {
            if (word[i] < valueToCompare[i]) {
                index = -(i + 1);
            }
            if (word[i] > valueToCompare[i]) {
                index = i + 1;
            }
        }
        return index;
    }

    MyString2 toUpperCase() {
        char[] ch = new char[word.length];
        for (int i = 0; i < word.length; i++) {
            if (word[i] >= 'a' && word[i] <= 'z') {
                ch[i] = (char) (word[i] - 32);
            } else {
                ch[i] = word[i];
            }
        }
        return new MyString2(ch);
    }

    char[] toChars() {
        return word;
    }

    static MyString2 valueOf(boolean trueOrFalse) {
        char[] ch;
        String trueStr = "true";
        String falseStr = "false";

        if (trueOrFalse) {
            ch = trueStr.toCharArray();
        } else {
            ch = falseStr.toCharArray();
        }

        return new MyString2(ch);
    }

    void printChar() {
        for (char c : word) {
            System.out.print(c + " ");
        }
    }
}
