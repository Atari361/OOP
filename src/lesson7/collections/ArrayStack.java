package lesson7.collections;

import lesson7.NestedInner;

/**
 * Created by dell on 6/6/2017.
 */
public class ArrayStack implements Stack {

    private Integer[] array;
    private Integer lastElemIndex = -1;
    public ArrayStack() {
        array = new Integer[10];
    }

    public ArrayStack(int size) {
        array = new Integer[size];
    }

    @Override
    public boolean push(int elem) {
        try {
            array[(lastElemIndex++)+1] = elem;
            return true;
        } catch (ArrayIndexOutOfBoundsException e){
            lastElemIndex--;
            return false;
        }
    }

    @Override
    public boolean empty() {
        if (lastElemIndex < 0) return false;
        return true;
    }

    @Override
    public Integer pop() {
        int lastElem = array[lastElemIndex];
        array[lastElemIndex--] = null;
        return lastElem;
    }

    @Override
    public Integer peek() {
        return array[lastElemIndex];
    }

    @Override
    public int size() {
        if (lastElemIndex == -1) return 0;
        return lastElemIndex+1;
    }

}
