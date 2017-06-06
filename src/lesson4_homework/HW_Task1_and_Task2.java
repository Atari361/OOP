package lesson4_homework;


import lesson4_homework.numbers.Fraction;
import lesson4_homework.numbers.Number;

/**
 * Created by letsk on 05/27/2017.
 */
public class HW_Task1_and_Task2 {
    public static void main(String[] args) {

        Number number4 = new Number(4);
        Number number2 = new Number(2);

        System.out.println(number4.get() + " plus " + number2.get() + " is: " + number4.add(number2).get());
        System.out.println(number4.get() + " minus " + number2.get() + " is: " + number4.sub(number2).get());
        System.out.println(number4.get() + " multiply to  " + number2.get() + " is: " + number4.mul(number2).get());
        System.out.println(number4.get() + " divide of " + number2.get() + " is: " + number4.div(number2).get());
        System.out.println(number2.get() + " power of " + number4.get() + " is: " + number2.pow(number4).get());
        System.out.println(number2.get() + " mod of " + number4.get() + " is: " + number2.mod(number4).get());
        System.out.println("Factorial of " + number4.get() + " is : " + number4.fact().get());

        System.out.println("\n===========================\n");

        Fraction fractionNumber4and123 = new Fraction(4.123);
        Fraction fractionNumber2and246 = new Fraction(2.246);

        System.out.println(fractionNumber4and123.get() + " plus " + fractionNumber2and246.get() + " is: " +
                fractionNumber4and123.add(fractionNumber2and246).get());
        System.out.println(fractionNumber4and123.get() + " minus " + fractionNumber2and246.get() + " is: " +
                fractionNumber4and123.sub(fractionNumber2and246).get());
        System.out.println(fractionNumber4and123.get() + " multiply to  " + fractionNumber2and246.get() + " is: " +
                fractionNumber4and123.mul(fractionNumber2and246).get());
        System.out.println(fractionNumber4and123.get() + " divide of " + fractionNumber2and246.get() + " is: " +
                fractionNumber4and123.div(fractionNumber2and246).get());

    }
}
