package eu.ciechanowiec.liang.chapter11_tasks.task_11_2;

import eu.ciechanowiec.liang.chapter10_tasks.task_10_14.MyDate;

class Employee extends  Person{

    private String office;
    private double salary;
    private MyDate dateHired;

    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        return String.format("""
                name: %s
                class name: %s
                """, name, className);
    }
}
