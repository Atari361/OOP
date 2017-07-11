package lesson14;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by dell on 7/4/2017.
 */
public class IterTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(555);
        list.add(124);
        list.add(56);
        list.add(7);
        list.add(92);

        System.out.println(list);

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + " ");
        }

    }
}
