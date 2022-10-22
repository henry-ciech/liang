package eu.ciechanowiec.liang.chapter10_innercode.listing_10_7_8;

class TestStackOfIntegers {

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.printf("%s ", stack.pop());
        }

        System.out.println();
    }
}
