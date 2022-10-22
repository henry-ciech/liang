package eu.ciechanowiec.liang.chapter10_tasks.task_10_23;

class MyString2 {

    private final String word;

    MyString2(String word) {
        this.word = word;
    }

    int compare(String valueToCompare) {
        int index = 0;

        if (word.length() < valueToCompare.length()) {
            index = -1;
        }
        if (valueToCompare.length() < word.length()) {
            index = 1;
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < valueToCompare.charAt(i)) {
                index = -(i + 1);
            }
            if (word.charAt(i) > valueToCompare.charAt(i)) {
                index = i + 1;
            }
        }
        return index;
    }

    MyString2 substring(int begin) {
        StringBuilder subStr = new StringBuilder();
        for (int i = begin; i < word.length(); i++) {
            subStr.append(word.charAt(i));
        }

        return new MyString2(subStr.toString());
    }

    MyString2 toUpperCase() {
        StringBuilder upperCase = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                upperCase.append((char) (word.charAt(i) - 32));
            } else {
                upperCase.append(word.charAt(i));
            }
        }

        return new MyString2(upperCase.toString());
    }

    char[] toChars() {
        char[] chars = new char[word.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] += word.charAt(i);
        }

        return chars;
    }

    static MyString2 valueOf(boolean trueOrFalse) {
        return (trueOrFalse ? new MyString2("true") : new MyString2("false"));
    }

    String printWord() {
        return word;
    }
 }
