public class BicycleDemo {
    public static void main(String args[]){

        //create two bicycles
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        //invoke the methods to change the state of the bicycles
        bike1.changeCadence(50);
        bike1.speedUp(20);
        bike1.changeGear(3);
        bike1.printState();

        bike2.changeCadence(20);
        bike2.speedUp(50);
        bike2.changeGear(5);
        bike2.applyBrake(20);
        bike2.changeGear(3);
        bike2.printState();
    }
}
