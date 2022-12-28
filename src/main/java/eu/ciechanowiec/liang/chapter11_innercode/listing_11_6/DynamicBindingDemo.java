package eu.ciechanowiec.liang.chapter11_innercode.listing_11_6;

class DynamicBindingDemo {

    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }

    static void m(Object x) {
        System.out.println(x.toString());
    }
}
