package LiskovSubstitutionPrinciple;

public class Professor extends Person{

    public Professor(double weight, double height) {
        super(weight, height);
    }

    @Override
    public void setWeight(double weight){
        super.setWeight(weight);
    }

    @Override
    public void setHeight(double height) {
         super.setHeight(height);
    }

    @Override
    public double getWeight(){
        return super.getWeight();
    }

    @Override
    public double getHeight(){
        return super.getHeight();
    }
}
