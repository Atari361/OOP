package lesson16;


import java.util.List;

/**
 * Created by dell on 7/11/2017.
 */
public interface Set <E> {

    boolean add (E element);
    boolean contains (E elem);
    boolean remove (E elem);

    List<E> toList();

}
