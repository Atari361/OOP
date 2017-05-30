package lesson6.phone;

/**
 * Created by dell on 5/30/2017.
 */
public interface SimCard {

    void balanceCheck();
    void refillBalance(int money);
    String getOperator();
    int getBalance();
}
