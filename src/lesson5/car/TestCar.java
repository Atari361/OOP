package lesson5.car;


/**
 * Created by dell on 5/23/2017.
 */
public class TestCar {

    public static void main(String[] args) {
        Car car = new Car("BMW", "black", 1992, 123);
        car.printAbout();

        Truck truck = new Truck("BMW", "black", 1992, 123, 400);

        truck.printTruck();
    }
}
