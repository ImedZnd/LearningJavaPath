package OpenClosedPrinciple;

public class Car extends VehicleInfo{

    @Override
    public String vehicleNumber(){
        return "this is a Car";
    }

    @Override
    public int testVehicle(){
        return 20;
    }
}
