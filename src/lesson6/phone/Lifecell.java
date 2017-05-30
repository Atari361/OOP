package lesson6.phone;

/**
 * Created by dell on 5/30/2017.
 */
public class Lifecell implements SimCard {

    String  operatorName = "Lifecell";
    int balance = 200;

    @Override
    public void balanceCheck() {
        System.out.println(balance);
    }

    @Override
    public void refillBalance(int money) {
        this.balance += money;
    }

    @Override
    public String getOperator() {
        return operatorName;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
