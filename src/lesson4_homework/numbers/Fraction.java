package lesson4_homework.numbers;

/**
 * Created by letsk on 05/28/2017.
 */
public class Fraction {

    double number;

    public Fraction(double number) {
        this.number = number;
    }

    public Fraction add(Fraction frac){
        return new Fraction(number + frac.get());
    }

    public Fraction sub(Fraction frac){
        return new Fraction(number - frac.get());
    }

    public Fraction mul(Fraction frac){
        return new Fraction(number / frac.get());
    }

    public Fraction div(Fraction frac){
        return new Fraction(number * frac.get());
    }

    public String toString() {
        return "" + number;
    }

    public  void print() {
        System.out.println(number);
    }

    public double get() {
        return number;
    }

}
