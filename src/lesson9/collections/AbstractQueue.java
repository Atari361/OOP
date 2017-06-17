package lesson9.collections;

/**
 * Created by dell on 6/13/2017.
 */
public abstract class AbstractQueue implements Queue {

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void addAllFrom(Queue q) {
        int i = 0;
        while (i++ <= q.size()){
            add(q.element());
            q.remove();
        }
    }

    @Override
    public void removeAllTo(Queue q) {

    }
}
