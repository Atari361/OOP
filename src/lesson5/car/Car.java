package lesson5.car;

/**
 * Created by dell on 5/29/2017.
 */
public class Car {

    private String model;
    private String color;
    private int year;
    private int number;

    public Car(){}

    public Car(String model, String color, int year, int number) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.number = number;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getNumber() {
        return number;
    }

    public void printAbout(){
        System.out.println("Model: " + model + "\nColor: " + color + "\nYear: " + year
                + "\nNumber: " + number);
    }



}
