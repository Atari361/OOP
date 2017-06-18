package lesson9.collections;

/**
 * Created by dell on 6/13/2017.
 */
public interface Queue {

    //boolean add(Integer el);
    boolean offer(Integer el);
    // returns exception

    //nteger remove();
    Integer poll();
    // NoSuchElementEception

    //Integer element(); //peak
    Integer peek(); //+exception

    /*
    int size();
    boolean isEmpty();
    void clear();
    Integer[] toArray();
    void addAllFrom(Queue q);
    void removeAllTo(Queue q);
    */


}
