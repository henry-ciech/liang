package eu.ciechanowiec.liang.chapter10_tasks.task_10_28;

class MyStringBuilder {

    private final String build;

    MyStringBuilder() {
        build = "";
    }

    MyStringBuilder(char[] chars) {
        build = String.valueOf(chars);
    }

    MyStringBuilder(String build) {
        this.build = build;
    }

    MyStringBuilder insert(int offset, MyStringBuilder str) {
        String newStr = "";
        for (int i = 0; i < offset; i++) {
            newStr += this.build.charAt(i) + "";
        }
        newStr += str;
        return new MyStringBuilder(newStr + substring(offset));
    }

    MyStringBuilder reverse() {
        String newStr = "";
        for (int i = build.length() - 1; i >= 0; i--) {
            newStr += build.charAt(i) + "";
        }
        return new MyStringBuilder(newStr);
    }

    MyStringBuilder substring(int begin) {
        String newStr = "";
        for (int i = begin; i < build.length(); i++) {
            newStr += build.charAt(i) + "";
        }
        return new MyStringBuilder(newStr);
    }

    MyStringBuilder toUpperCase() {
        String newStr = "";
        for (int i = 0; i < build.length(); i++) {
            if (build.charAt(i) >= 'a' && build.charAt(i) <= 'z')
                newStr += (char)(build.charAt(i) - 32) + "";
            else
                newStr += build.charAt(i) + "";
        }
        return new MyStringBuilder(newStr);
    }

    String MyToString() {
        return build;
    }

    int length() {
        return build.length();
    }

    char charAt(int index) {
        return build.charAt(index);
    }
}
