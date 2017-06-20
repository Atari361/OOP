package lesson11;

/**
 * Created by dell on 6/20/2017.
 */
public interface List {

    void add(Integer el);
    void add(int idx, Integer el);
    Integer get(int idx);
    Integer set(int idx, Integer el);
    Integer remove(int idx);
    List sublist(int idxFrom, int idxTo);
    boolean isEmpty();
    boolean contains(Integer el);
    int size();
    int indexOf(Integer el);
    void clear();
}
