package OpenClosedPrinciple;

public class Truck extends VehicleInfo{

    @Override
    public String vehicleNumber()
    {
        return "This is Truck";
    }

    @Override
    public int testVehicle(){
        return 50;
    }
}
