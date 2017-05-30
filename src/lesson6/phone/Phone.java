package lesson6.phone;

/**
 * Created by dell on 5/30/2017.
 */
public class Phone {

    String model;
    String brand;
    SimCard simCard;

    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public void changeSimCard(SimCard simCard){
        if (this.simCard == null){
            System.out.println("NO SIMCARD! Inserted: " + simCard.getOperator());
        } else {
            System.out.println("WARRING! Simcard was changed to: " + simCard.getOperator());
        }
        this.simCard = simCard;
    }

    public SimCard getSimCard() {
        return simCard;
    }
}
