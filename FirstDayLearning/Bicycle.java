public class Bicycle {

    //States
    int cadence = 0 ;
    int speed = 0 ;
    int gear = 1 ;
    long creditCardNumber = 1234_5678_9012_3456L;


    //Behave
    void changeCadence(int newValue){
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void speedUp(int increment){
        speed = speed + increment;
    }

    void applyBrake(int decrement){
        speed = speed - decrement;
    }

    void printState(){
        System.out.println("cadence : " + cadence + " gear : " + gear + " speed : " + speed);
    }

}
