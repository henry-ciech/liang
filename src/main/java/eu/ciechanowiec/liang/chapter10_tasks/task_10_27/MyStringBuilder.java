package eu.ciechanowiec.liang.chapter10_tasks.task_10_27;

class MyStringBuilder {

    String build = "";

    MyStringBuilder(String build) {
        this.build += build;
    }

    MyStringBuilder append (MyStringBuilder string) {
        build += String.valueOf(string);
        return new MyStringBuilder(build);
    }

    MyStringBuilder append (int number) {
        build += String.valueOf(number);
        return new MyStringBuilder(build);
    }

    int length() {
        return String.valueOf(build).length();
    }

    char charAt(int index) {
        return build.charAt(index);
    }

    MyStringBuilder toLowerCase() {
        String lowerCase = "";
        for (int i = 0; i < length(); i++) {
            if (build.charAt(i) >= 'A' && build.charAt(i) <= 'Z') {
                lowerCase += (char) (build.charAt(i) + 32);
            } else {
                lowerCase += build.charAt(i);
            }
        }
        return new MyStringBuilder(lowerCase);
    }

    MyStringBuilder substring(int begin, int end) {
        String subStr = "";

        for (int i = begin, j = 0; i < end; i++, j++) {
            subStr += build.charAt(i);
        }

        return new MyStringBuilder(subStr);
    }

    String BuilderToString() {
        String toStr = "";
        toStr += build;
        return toStr;
    }

    String getBuild() {
        return build;
    }
}
