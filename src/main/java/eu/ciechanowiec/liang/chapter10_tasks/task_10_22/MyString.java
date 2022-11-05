package eu.ciechanowiec.liang.chapter10_tasks.task_10_22;

class MyString {

    private final char[] chars;

    MyString(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    char charAt(int index) {
        return chars[index];
    }

    int length() {
        return chars.length;
    }

    MyString substring(int begin, int end) {
        char[] ch = new char[end - begin];

        for (int i = begin, j = 0; i < end; i++, j++) {
            ch[j] = chars[i];
        }

        return new MyString(ch);
    }

    MyString toLowerCase() {
        char[] ch = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                ch[i] = (char) (chars[i] + 32);
            } else {
                ch[i] = chars[i];
            }
        }
        return new MyString(ch);
    }

    boolean equals(MyString string1) {
        if (chars.length != string1.length()) {
            return false;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != string1.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    static MyString valueOf(int number) {
        int length = 0;
        int number1 = number;

        while (number1 >= 1) {
            number1 /= 10;
            length++;
        }
        char[] ch = new char[length];

        for (int j = 0, k = (int) Math.pow(10, length - 1);
             j < length; j++, k /= 10) {
            ch[j] = Character.forDigit((number / k), 10);
            number %= k;
        }

        return new MyString(ch);
    }
}
