package lesson7.collections;

/**
 * Created by dell on 6/6/2017.
 */
public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(3);
        System.out.println(stack.empty());
        stack.push(1);
        stack.push(3);
        stack.push(2);
        System.out.println(stack.toString());
    }
}
