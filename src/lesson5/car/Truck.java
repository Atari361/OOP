package lesson5.car;

/**
 * Created by dell on 5/29/2017.
 */
public class Truck extends Car {
    int capacity;

    public Truck(){}

    public Truck(String model, String color, int year, int number, int capacity) {
        super(model, color, year, number);

        this.capacity = capacity;
    }

    public void printTruck(){
        System.out.println("Model: " + this.getModel() + "\nColor: " + this.getColor() + "\nYear: " + this.getYear()
                + "\nNumber: " + this.getNumber() + "\nCapacity: " + capacity);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Model: " + this.getModel() + "\nColor: " + this.getColor() + "\nYear: " + this.getYear()
                + "\nNumber: " + this.getNumber() + "\nCapacity: " + capacity);
        return sb.toString();
    }



}
