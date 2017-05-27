package lesson4_homework.calculator;

/**
 * Created by letsk on 05/27/2017.
 */
public class Number {

    int number;

    public Number(int num){
        number = num;
    }


    public int get() {
        return number;
    }

    public Number addNumber(Number num) {
        return new Number(this.number += num.get());
    }

    public Number sub(Number num){
        return new Number(this.number -= num.get());
    }
    public Number  mul(Number num){
        return new Number(this.number *= num.get());
    }
    public Number  div(Number num){
        return new Number(this.number /= num.get());
    }
    public Number pow(Number exponent){
        return new Number(0);
    }
    public Number fact(){
        return new Number(0);
    }
    public Number mod(Number num){
        return new Number(0);
    }
}
