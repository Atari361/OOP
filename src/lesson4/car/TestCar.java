package lesson4.car;

/**
 * Created by dell on 5/23/2017.
 */
public class TestCar {

    public static void main(String[] args) {
        Car car = new Car("BMW", "black", 1992, 60, 10);
        car.printAbout();
        car.start();
        car.go(100);
        car.stop();
    }
}
