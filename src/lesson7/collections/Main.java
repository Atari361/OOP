package lesson7.collections;

/**
 * Created by dell on 6/6/2017.
 */
public class Main {

    public static void main(String[] args) {

        LinkedList nodes = new LinkedList();

        nodes.empty();
        nodes.push(3);
        nodes.push(5);
        nodes.push(2);
        nodes.push(6);
        nodes.push(4);
        nodes.pop();
        System.out.println(nodes);


//        ArrayStack stack = new ArrayStack(3);
//        System.out.println(stack.empty());
//        System.out.println(stack.size());
//        System.out.println(stack.push(1));
//        System.out.println(stack.push(3));
//        System.out.println(stack.push(2));
//        System.out.println(stack.push(4));
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.empty());
//        System.out.println(stack.size());
//        System.out.println(stack.toString());

    }
}
