package OpenClosedPrinciple;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car();
        VehicleInfo car2 = new Car();
        Truck truck1 = new Truck();
        VehicleInfo truck2 = new Truck();
        Vehicle ve1= new Vehicle();

        List<VehicleInfo> listOfVehicle = List.of(car1,car2,truck1,truck2,ve1);
        listOfVehicle.forEach((e)-> System.out.println("e = " + e.vehicleNumber()));
        listOfVehicle.stream()
                .map(e->e.testVehicle()+5)
                .forEach(System.out::println);
    }
}
