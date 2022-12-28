package eu.ciechanowiec.liang.chapter11_tasks.task_11_2;

class Student extends Person {

    private static final String FRESHMAN = "Freshman";
    private static final String SOPHOMORE = "Sophomore";
    private static final String JUNIOR = "Junior";
    private static final String SENIOR = "Senior";

    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        return String.format("""
                name: %s
                class name: %s
                """, name, className);
    }
}
