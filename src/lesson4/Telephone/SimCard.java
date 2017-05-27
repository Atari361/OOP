package lesson4.Telephone;

/**
 * Created by dell on 5/23/2017.
 */
public class SimCard {

    private double balance;
    private double tarif;

    public SimCard(String operator){
        switch (operator){
            case "Vodafone": {
                this.balance = 10;
                this.tarif = 0.10;
            }
            case "Life": {
                this.balance = 15;
                this.tarif = 0.20;
            }

            case "Kyivstar": {
                this.balance = 20;
                this.tarif = 0.30;
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTarif() {
        return tarif;
    }



}
