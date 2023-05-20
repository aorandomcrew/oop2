public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        Truck truck = new Truck("Truck1", 4);
        Truck truck2 = new Truck("Truck2", 4);

        ServiceStation station = new ServiceStation();

        Transport[] transports = {car, car2, bicycle, bicycle2, truck, truck2};
        for (Transport transport : transports) {
            station.check(transport);
        }
    }
}
