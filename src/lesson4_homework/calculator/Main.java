package lesson4_homework.calculator;


/**
 * Created by letsk on 05/27/2017.
 */
public class Main {
    public static void main(String[] args) {

        Number number4 = new Number(4);
        Number number2 = new Number(2);
        System.out.println("4 plus 2 is: " + number4.add(number2).get());
        System.out.println("4 minus 2 is: " + number4.sub(number2).get());
        System.out.println("4 multiply 2 is: " + number4.mul(number2).get());
        System.out.println("4 divide 2 is: " + number4.div(number2).get());
        System.out.println("2 power of 4 is: " + number2.pow(number4).get());
        System.out.println("2 mod of 4 is: " + number2.mod(number4).get());
        System.out.println("Factorial of 4 is : " + number4.fact().get());
    }
}
