package lesson4.car;

/**
 * Created by dell on 5/23/2017.
 */
public class Car {
    private String model;
    private String color;
    private int year;
    private int fuel;
    private int consumption;
    private String state;

    public Car (String model, String color){
        this.model =  model;
        this.color = color;
    }

    public Car (String model, String color, int year, int fuel, int consumption){
        this(model, color);
        this.year = year;
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void printAbout(){
        System.out.println("Model: " + model + "\nColor: " + color + "\nYear: " + year +
        "\nFuel: " + fuel + "\nConsumption: " + consumption + "L for 100km");
    }

    public void start(){
        System.out.println("Changed car state to: STARTED");
        if (fuel > 0 && state != "STARTED" && state != "FILLING" && state != "GOING") {
            state = "STARTED";
        }
    }
    public void stop(){
        System.out.println("Changed car state to: STOPPED");
        if (state != "STOPPED" && state != "FILLING") {
            state = "STOPPED";
        }
    }

    public void filling(int amount){
        System.out.println("Changed car state to: FILLING");
        if (state != "FILLING" && state != "GOING") {
            state = "FILLING";
        }
        fuel = fuel + amount;
    }

    public void go(int distance){
        System.out.println("Changed car state to: GOING");
        if (fuel > 0 && state != "GOING" && state != "STOPPED" && state != "FILLING") {
            state = "GOING";
            for (int i=fuel; i > 0; i--){
                distance -= 10;
                if (distance == 0){
                    fuel = i;
                    System.out.println("FINISHED! Fuel left: " + fuel + "L");
                    return;
                }
            }
            System.out.println("NO FUEL LEFT");
            stop();
            fuel = 0;
        }
        System.out.println(fuel);
    }


    public void info(){

    }

}
