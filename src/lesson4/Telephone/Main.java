package lesson4.Telephone;

/**
 * Created by dell on 5/23/2017.
 */
public class Main {
    public static void main(String[] args) {
//        SimCard simCard = new SimCard("Life");
        Phone phone = new Phone("iPhone", new SimCard());
        phone.newContact("Igor", 123);
        phone.newContact("Igor2", 123);
        phone.newContact("Igor3", 123);
        phone.showContacts();

        phone.randomCall(10); // Should return error.
//        phone.setSimCard(simCard);
        phone.getSimcardInfo();
        phone.randomCall(66.6); // no error
        phone.randomCall(66.6);
        phone.refillBalance(100);
        phone.randomCall(66.6);
        phone.getSimcardInfo();
    }
}
