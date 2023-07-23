package Others.ClassTest;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new DiselSuv(), new ElectricCar()};
        for (Vehicle v : vehicles) {
            v.addFuel();
            v.reportPosition();
        }
    }
}
