package lesson10;

/**
 * Created by letsk on 06/18/2017.
 */
public class Main {

    // 1. Peak у разных интерфейсов
    // 2. Pop and Poll - no diff?

    public static void main(String[] args) {
//        System.out.println(fibo(6));
        System.out.println(5);
    }

    private static int fact(int a){
        if (a == 1) return 1;
        return fact(a)*fact(a-1);
    }

    private static int fibo(int a) {
        if (a < 3) return 1;
        return fibo(a-1) + fibo(a-2);
    }

    private static String polindrome1(int i) {
        String result = i + " ";
        if (--i != 0) {
            result += polindrome1(i);
        } else {
            result += 0 + " ";
        }
        result += ++i + " ";
        return result;
    }

    private static void print(int i) {
        if (i == -1) return;
        print(--i);
        System.out.print(++i + " ");
    }

}
