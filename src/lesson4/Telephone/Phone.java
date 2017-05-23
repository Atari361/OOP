package lesson4.Telephone;

import java.util.ArrayList;

/**
 * Created by dell on 5/23/2017.
 */
public class Phone {

    String model;
    SimCard simCard;
    ArrayList<Contact> contacts = new ArrayList<>();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public SimCard getSimCard() {
        return simCard;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public void refillBalance(Integer money){
        this.simCard.setBalance(money);
    }
    public void newContact(String name, Integer phone){
        contacts.add(new Contact(name, phone));
    }

    public void showContacts(){
        for (Contact contact : contacts){
            System.out.println("Contact name: " + contact.getFIO());
            System.out.println("Contact phone: " + contact.getTelephone());
            System.out.println();
        }
    }

    public void call(Integer minutes){
        int randomIndex = (int) Math.round(Math.random()*contacts.size());
        System.out.println("Call to " + contacts.get(randomIndex).getFIO() + "\nPhone: " +
                contacts.get(randomIndex).getTelephone());
    }

}
