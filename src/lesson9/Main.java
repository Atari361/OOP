package lesson9;

import lesson9.collections.ArrayQueue;
import lesson9.collections.LinkedQueue;

/**
 * Created by dell on 6/13/2017.
 */
public class Main {
    public static void main(String[] args) {

//        LinkedQueue queue = new LinkedQueue();
//        LinkedQueue queue2 = new LinkedQueue();
//        queue.add(3);
//        queue.add(5);
//        queue.add(4);
//        queue.add(2);
//        queue.remove();
//        queue2.add(11);
//        queue2.add(15);
//        queue.addAllFrom(queue2);
//        System.out.println(queue);

        ArrayQueue arr = new ArrayQueue(5);
        arr.add(4);
        arr.add(2);
        arr.add(5);
        arr.add(7);
        arr.remove();
        System.out.println();


    }
}
