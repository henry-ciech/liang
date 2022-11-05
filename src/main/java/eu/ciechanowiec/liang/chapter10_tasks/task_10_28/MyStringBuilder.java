package eu.ciechanowiec.liang.chapter10_tasks.task_10_28;

class MyStringBuilder {

    private final char[] word;
    private static final String TEST = "test";

    MyStringBuilder() {
        word = TEST.toCharArray();
    }

    MyStringBuilder(char[] word) {
        this.word = new char[word.length];
    }

    MyStringBuilder(String build) {
        word = build.toCharArray();
    }

    MyStringBuilder insert(int offset, MyStringBuilder str) {
        char[] newChar = new char[str.length() + word.length];
        if (offset >= 0) {
            System.arraycopy(word, 0, newChar, 0, offset);
        }

        for (int i = offset, j = 0; j < str.length(); i++, j++) {
            newChar[i] = str.charAt(j);
        }

        if (word.length - (str.length() + offset) >= 0) {
            System.arraycopy(word, str.length() + offset,
                    newChar, str.length() + offset, word.length - (str.length() + offset));

        }

        return new MyStringBuilder(newChar);
    }

    MyStringBuilder reverse() {
        char[] newChar = new char[word.length];

        for (int i = word.length - 1, j = 0; i >= 0; i--, j++) {
            newChar[i] = word[j];
        }

        return new MyStringBuilder(newChar);
    }

    MyStringBuilder toUpperCase() {
        char[] ch = new char[word.length];
        for (int i = 0; i < word.length; i++) {
            if (word[i] >= 'a' && word[i] <= 'z') {
                ch[i] = (char) (word[i] - 32);
            } else {
                ch[i] = word[i];
            }
        }
        return new MyStringBuilder(ch);}

    int length() {
        return word.length;
    }

    char charAt(int index) {
        return word[index];
    }

    char[] getWord() {
        return word;
    }
}
