package lesson9.collections;

import java.util.NoSuchElementException;

/**
 * Created by dell on 6/13/2017.
 */
public class ArrayQueue extends AbstractQueue{
    private Integer[] array;
    private int lastIndex = 0;
    private int size;

    public ArrayQueue(int size){
        array = new Integer[size];
        this.size = size;
    }

    @Override
    public boolean add(Integer el) {
        if (el == null) return false;

        if (lastIndex == 0){
            array[0] = el;
            lastIndex++;
        } else {
            array[lastIndex++] = el;
        }
        return true;
    }

    @Override
    public boolean offer(Integer el) {
        return false;
    }

    @Override
    public Integer remove() {
        Integer result = array[0];
        for (int i=0; i < size-1; i++){
            array[i] = array[i+1];
        }
        return result;
    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer element() {
        return array[0];
    }

    @Override
    public Integer peek() throws NullPointerException{
        if (array[0] == null) {
            throw new NoSuchElementException();
        } else {
            return element();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Integer[size];
    }

    @Override
    public Integer[] toArray() {
        return array;
    }
}
