package Exercises;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    // Constructor with name, age, weight, and height
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Constructor with name, weight, and height
    // Default age = 20
    public BMI(String name, double weight, double height) {
        this.name = name;
        this.age = 20;
        this.weight = weight;
        this.height = height;
    }

    // Calculate BMI
    public double getBMI() {
        return (weight * 703) / (height * height);
    }

    // Get BMI status
    public String getStatus() {
        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        }
        else if (bmi < 25.0) {
            return "Normal";
        }
        else if (bmi < 30.0) {
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }


    public static void main(String[] args) {

        BMI bmi = new BMI("Aisha", 18, 112, 65);

        System.out.println("Name: " + bmi.getName());
        System.out.println("BMI: " + bmi.getBMI());
        System.out.println("Status: " + bmi.getStatus());
    }
}
