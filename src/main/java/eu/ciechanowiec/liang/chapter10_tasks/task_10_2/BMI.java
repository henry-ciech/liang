package eu.ciechanowiec.liang.chapter10_tasks.task_10_2;

class BMI {

    private final String name;
    private int age;
    private final double weight;
    private final double height;
    private static final double KILOGRAMS_PER_POUND = 0.45359237;
    private static final double METERS_PER_INCH = 0.0254;

    BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = feet * 12 + inches;
    }

    BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND /
                ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }

    String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getWeight() {
        return weight;
    }

    double getHeight() {
        return height;
    }
}
