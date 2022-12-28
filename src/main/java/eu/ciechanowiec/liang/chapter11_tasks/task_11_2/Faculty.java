package eu.ciechanowiec.liang.chapter11_tasks.task_11_2;

class Faculty extends Employee {

    private int officeHour;
    private int rank;

    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        return String.format("""
                name: %s
                class name: %s
                """, name, className);
    }
}
