package lesson4_homework.objects;

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

    public Number add(Number num) {
        return new Number(this.number + num.get());
    }

    public Number sub(Number num){
        return new Number(this.number - num.get());
    }

    public Number mul(Number num){
        return new Number(this.number * num.get());
    }

    public Number div(Number num){
        return new Number(this.number / num.get());
    }

    public Number pow(Number exponent){
        int result = 0;
        for (int i = 0; i < exponent.get(); i++) {
            result += mul(this).get();
        }
        return new Number(result);
    }

    public Number fact(){

        if (number == 0){
            return new Number(1);
        }

        return new Number(number * new Number(number-1).fact().get());
    }

    public Number mod(Number num){
        return new Number(this.number % num.get());
    }

}
