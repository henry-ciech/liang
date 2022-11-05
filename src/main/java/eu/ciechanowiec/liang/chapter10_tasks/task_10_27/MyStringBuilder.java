package eu.ciechanowiec.liang.chapter10_tasks.task_10_27;

class MyStringBuilder {

    private final char[] word;

    MyStringBuilder(char[] word) {
        this.word = new char[word.length];
    }

    MyStringBuilder append (MyStringBuilder string) {
        char[] newBuild = new char[string.length() + word.length];
        System.arraycopy(word, 0, newBuild, 0, word.length);

        for (int i = word.length; i < string.length(); i++) {
            newBuild[i] = string.charAt(i);
        }
        return new MyStringBuilder(newBuild);
    }

    MyStringBuilder append(int number) {
        int count = 0;
        char[] digits = String.valueOf(number).toCharArray();
        for (; number != 0; number /= 10, ++count);

        char[] newStr = new char[word.length + count];

        for (int i = 0; i < count; i++) {
            newStr[word.length + i] = digits[i];
        }
        return new MyStringBuilder(newStr);
    }

    int length() {
        return word.length;
    }

    char charAt(int index) {
        return word[index];
    }

    MyStringBuilder toLowerCase() {
        char[] ch = new char[word.length];
        for (int i = 0; i < word.length; i++) {
            if (word[i] >= 'A' && word[i] <= 'Z') {
                ch[i] = (char) (word[i] + 32);
            } else {
                ch[i] = word[i];
            }
        }
        return new MyStringBuilder(ch);
    }

    char[] getWord() {
        return word;
    }
}
