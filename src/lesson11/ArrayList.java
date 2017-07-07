package lesson11;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by pavlo.letskyi on 7/7/2017.
 */
public class ArrayList implements List, Iterable<Integer> {

    private Integer[] array;
    private Integer currentIndex = 0;
    int size = 10;
    public ArrayList() {
        array = createNewArray();
    }

    private Integer[] createNewArray(){
        return new Integer[10];
    }

    @Override
    public void add(Integer el) {
        if (currentIndex == size) extendArray();
        array[currentIndex++] = el;
    }

    @Override
    public void add(int idx, Integer el) {
        freeIndex(idx);
        array[idx] = el;
    }

    private void extendArray() {
        Integer[] extendedArray = createNewArray();
        for (int i = 0; i < currentIndex; i++) {
            extendedArray[i] = array[i];
        }
        array = extendedArray;
    }

    private void freeIndex(int idx) {
        if (currentIndex == size) size *= 2;
        Integer[] copyArray = new Integer[size];
        for (int i = 0, j = 0; i <= currentIndex; i++, j++) {
            if (i == idx) {
                i++;
            }
            copyArray[i] = array[j];
        }
        array = copyArray;
    }

    @Override
    public Integer get(int idx) {
        return array[idx];
    }

    @Override
    public Integer set(int idx, Integer el) {
        int result = array[idx];
        array[idx] = el;
        return result;
    }

    @Override
    public Integer remove(int idx) {
        Integer[] extendedArray = new Integer[size];
        int result = 0;
        for (int i = 0, j = 0; i < currentIndex; i++, j++) {
            if (i==idx) {
                result = array[i++];
            }
            extendedArray[j] = array[i];
        }
        currentIndex--;
        array = extendedArray;
        return result;
    }

    @Override
    public List sublist(int idxFrom, int idxTo) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Integer el) {
        for (int i = 0; i < currentIndex; i++) {
            if (array[i] == el){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int indexOf(Integer el) throws NoSuchElementException {
        for (int i = 0; i < currentIndex; i++) {
            if (array[i].equals(el)) return i;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void clear() {
        array = createNewArray();
    }

    @Override
    public String toString(){
        String result = "[";
        for (int i = 0; i <= currentIndex; i++) {
            result += array[i] + ", ";
        }
        result = result.substring(0, result.length()-2) + "]";
        return result;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iter = new Iterator<Integer>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return array[i] != null;
            }

            @Override
            public Integer next() {
                int result = array[i++];
                return result;
            }
        };
        return iter;
    }
}
