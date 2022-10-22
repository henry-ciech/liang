package eu.ciechanowiec.liang.chapter10_tasks.task_10_24;

class MyCharacter {

    private char ch;

    MyCharacter(char ch) {
        this.ch = ch;
    }

    static boolean isDigit(char ch) {
        return ch <= '9' && ch >= '0';
    }

    static boolean isLowerCase(char ch) {
        return (ch <= 'z' && ch >= 'a');
    }

    static boolean isUpperCase(char ch) {
        return (ch <= 'Z' && ch >= 'A');
    }

    static boolean isLetter(char ch) {
        return (ch <= 'z' && ch >= 'a') ||
                (ch <= 'Z' && ch >= 'A');
    }

    static boolean isLetterOrDigit(char ch) {
        return isLetter(ch) || isDigit(ch);
    }

    static char toUpperCase(char ch) {
        if (isLowerCase(ch)) {
            return (char) (ch - 'a' + 'A');
        } else {
            return ch;
        }
    }

    static char toLowerCase(char ch) {
        if (isUpperCase(ch)) {
            return (char) (ch - 'A' + 'a');
        } else {
            return ch;
        }
    }

    boolean isDigit() {
        return isDigit(ch);
    }

    boolean isLetter() {
        return isLetter(ch);
    }

    char getChar() {
        return ch;
    }

    int compareTo(MyCharacter ch) {
        return this.ch - ch.getChar();
    }

    boolean equals(MyCharacter ch) {
        return this.ch == ch.getChar();
    }
}
