package b;
import a.Car;
public class Vehicle extends Car {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.test(v);
    }
    private void test(Car obj) {
        drive();
    }
}