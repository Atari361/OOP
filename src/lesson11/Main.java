package lesson11;

import java.util.*;

/**
 * Created by dell on 6/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        //LinkedList list = new LinkedList();
        java.util.ArrayList arr = new java.util.ArrayList();
        Integer[] arr2 = {1};
        for (int i : arr2){
            System.out.println();
        }
        ArrayList list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(4, 0);
        list.set(5, 999);
        list.contains(999);
        //System.out.println(list.indexOf(999));
        //list.remove(2);
        for (int i : list){
            System.out.println(i);
        }
//        for (int i : list){
//            System.out.println(i);
//        }
//        list.add(3, 4);
//        list.set(1,999);
//        list.remove(5);
        //System.out.println(list.indexOf(9));
        //System.out.println(list);
    }
}
