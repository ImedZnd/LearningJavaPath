package LiskovSubstitutionPrinciple;

public class Person {

    private double height;
    private double weight;

    public Person(double weight, double height) {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
