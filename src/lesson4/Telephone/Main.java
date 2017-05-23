package lesson4.Telephone;

/**
 * Created by dell on 5/23/2017.
 */
public class Main {
    public static void main(String[] args) {
        SimCard simCard = new SimCard();
        simCard.setBalance(100);
        simCard.setTarif(5);
        Phone phone = new Phone();
        phone.setSimCard(simCard);
        phone.setModel("iPhone");
        phone.newContact("Igor", 123);
        phone.newContact("Igor2", 123);
        phone.newContact("Igor3", 123);
        phone.showContacts();
    }
}
