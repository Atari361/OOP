package lesson4.Telephone;

/**
 * Created by dell on 5/23/2017.
 */
public class SimCard {

    int balance;
    int tarif;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

}
