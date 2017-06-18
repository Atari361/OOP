package lesson9_homework;

import lesson9.collections.LinkedQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by letsk on 06/18/2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedDeque queue = new LinkedDeque();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.offer(4);
        queue.addFirst(55);
        queue.addLast(66);
        queue.pollLast();
        System.out.println();

        LinkedList<Integer> queue1 = new LinkedList<>();
        queue1.offer(1);

    }
}
