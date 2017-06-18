package lesson7.collections;

/**
 * Created by dell on 6/6/2017.
 */
public interface Stack {

    boolean push(Integer elem); // add elem
    //boolean empty();
    Integer pop(); // removed last element and returns it
    Integer peek(); // return last element
    //int size();
}
