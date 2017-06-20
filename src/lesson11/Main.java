package lesson11;

/**
 * Created by dell on 6/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
//        list.add(3, 4);
//        list.set(1,999);
//        list.remove(5);
        System.out.println(list.indexOf(9));
        System.out.println(list);
    }
}
