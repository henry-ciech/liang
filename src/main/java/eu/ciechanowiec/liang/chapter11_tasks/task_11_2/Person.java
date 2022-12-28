package eu.ciechanowiec.liang.chapter11_tasks.task_11_2;

class Person {

    protected String name;
    private String address;
    private int phoneNumber;
    private String eMailAddress;

    protected Person() {
        this.name = "Mike";
    }

    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        return String.format("""
                name: %s
                class name: %s
                """, name, className);
    }
}

