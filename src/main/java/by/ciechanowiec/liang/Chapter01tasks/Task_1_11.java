package by.ciechanowiec.liang.Chapter01tasks;

public class Task_1_11 {
    final static int days = 365 * 5;
    final static int seconds = 86400 * days;
    final static int presentPopulation = 312032486;

    public static void main(String[] args) {
        int peopleBorn = seconds / 7;
        int peopleDied = seconds / 13;
        int peopleImmigrate = seconds / 45;
        int plusPeopleFor5Years = peopleBorn + peopleImmigrate - peopleDied;
        int populationIn5Years = presentPopulation + plusPeopleFor5Years;
        System.out.println(populationIn5Years);
    }
}
