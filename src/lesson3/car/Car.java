package lesson3.car;

/**
 * Created by dell on 5/22/2017.
 */
public class Car {
    public String model;
    protected String color;
    int year;
    private String className = "className";

    public void printAbout(){
        System.out.println("Model: " + model + "\nColor: " + color + "\nYear: " + year);
    }

    public static void printCar(){
        System.out.println("CAR");
    }
}
