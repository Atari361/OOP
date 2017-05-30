package lesson4.Telephone;

import java.util.ArrayList;

/**
 * Created by dell on 5/23/2017.
 */
public class Phone {

    protected String model;
    protected SimCard simCard;
    protected ArrayList<Contact> contacts = new ArrayList<>();

    public Phone(String model, SimCard simCard) {
        this.model = model;
        this.simCard = simCard;
    }

    public Phone(String model) {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public SimCard getSimCard() {
        return null;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
        System.out.println("Simcard is SET\n");
    }

    public void refillBalance(Integer money){
        this.simCard.setBalance(money);
        System.out.println("Added + " + money + " uah to your balance!\n");
    }

    public void newContact(String name, Integer phone){
        contacts.add(new Contact(name, phone));
    }

    public void showContacts(){
        for (Contact contact : contacts){
            System.out.println("Contact name: " + contact.getFIO());
            System.out.println("Contact phone: " + contact.getTelephone() + "\n");
        }
    }

    public void randomCall(double minutes){
        if (simCard == null || model == ""){
            System.out.println("Unable to call! Phone is not set properly!" + "\n");
        } else {
            if (simCard.getBalance()/simCard.getTarif() > minutes){
                simCard.setBalance(simCard.getBalance() - simCard.getTarif()*minutes);
                int randomIndex = (int) (Math.random() * contacts.size());
                System.out.println("Calling to " + contacts.get(randomIndex).getFIO() + "\nPhone: " +
                        contacts.get(randomIndex).getTelephone() + "\n");
                System.out.println("Your current balance: " + getSimCard().getBalance() + " uah\n");
            } else {
                System.out.println("Not enough money to make a call for " +minutes+ " minutes!");
                System.out.println("You can call maximum for : " + simCard.getBalance()/simCard.getTarif() + " mins!\n");
            }
        }
    }

    public String getSimcardInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Your balance: " + getSimCard().getBalance() +
                "\nYour tarif: " + getSimCard().getTarif() + " uah/min\n");
        return sb.toString();
    }



}
