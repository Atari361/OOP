package lesson3.car;

/**
 * Created by dell on 5/22/2017.
 */
public class CarTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.model = "Opel";
        car.year = 2007;
        car.printAbout();

        System.out.println();

        Car car2 = new Car();
        car2.color = "black";
        car2.model = "BMW";
        car2.year = 1992;
        car2.printAbout();

    }

}
