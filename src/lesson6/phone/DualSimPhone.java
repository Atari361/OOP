package lesson6.phone;

import java.util.ArrayList;

/**
 * Created by dell on 5/30/2017.
 */
public class DualSimPhone {

    String model;
    String brand;
    ArrayList<SimCard> simCards = new ArrayList<>();

    public DualSimPhone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public void changeSimCard(SimCard simCard, int slot) {

        if (simCards.size() == 0){
            System.out.println("NO SIMCARDS AT ALL!");
            simCards.add(simCard);
//        } else if (simCards.get(slot) == null){
//            System.out.println("SLOT #" + slot + " has NO SIMCARD! Inserted: " + simCard.getOperator());
//            simCards.add(simCard);
        } else {
            System.out.println("SLOT #" + slot + "ALready has simcard!\nSimcard was changed to: " + simCard.getOperator());
            simCards.set(slot, simCard);
        }
    }

    public void printSimCards(){
        int i = 0;
        for (SimCard sim : simCards){
            i++;
            System.out.println("SLOT #" + i + "\nOperator :" + sim.getOperator());
        }
    }
}
