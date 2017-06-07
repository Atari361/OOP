package lesson7.collections;

import lesson7.NestedInner;

/**
 * Created by dell on 6/6/2017.
 */
public class ArrayStack implements Stack {

    private Integer[] array;
    private Integer nextElemIndex = 0;
    private Integer lastElemIndex;
    public ArrayStack() {
        array = new Integer[10];
    }

    public ArrayStack(int size) {
        array = new Integer[size];
    }

    @Override
    public boolean push(int elem) {
        try {
            array[nextElemIndex++] = elem;
            return true;
        } catch (ArrayIndexOutOfBoundsException e){
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
        array[lastElemIndex] = null;
        return lastElem;
    }

    @Override
    public Integer peek() {
        return array[lastElemIndex];
    }

    @Override
    public int size() {
        if (lastElemIndex == -1) throw new NullPointerException("ERROR");
        return lastElemIndex;
    }
    @Override
    public String toString(){
        String result = "[";
        for (int i = (nextElemIndex-1); i >= 0; i--){
            result += array[i] + ", ";
        }
        result = result.substring(0, result.length()-2);
        return result + "]";
    }
}
