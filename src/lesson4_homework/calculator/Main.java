package lesson4_homework.calculator;


/**
 * Created by letsk on 05/27/2017.
 */
public class Main {
    public static void main(String[] args) {

        Number number5 = new Number(6);
        Number number6 = new Number(2);
        number5.div(number6);
        System.out.println(number5.get());
    }
}
