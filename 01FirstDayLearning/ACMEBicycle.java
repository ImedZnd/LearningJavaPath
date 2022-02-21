public class ACMEBicycle  implements InterfaceBicycle{

    int cadence = 0;
    int speed = 0;
    int gear = 1;


    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increments) {
        speed = speed + increments;
    }

    @Override
    public void applyBreak(int decrements) {
        speed = speed - decrements;
    }

    void printState(){
        System.out.println("cadence : " + cadence + " gear : " + gear + " speed : " + speed);
    }

}
