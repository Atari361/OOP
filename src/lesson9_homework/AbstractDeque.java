package lesson9_homework;

/**
 * Created by letsk on 06/18/2017.
 */

public abstract class AbstractDeque implements Deque {

    @Override
    public void addFirst(Integer element) {
        push(element);
    }

    @Override
    public void addLast(Integer element) {
        offer(element);
    }

    @Override
    public boolean offerFirst(Integer element){
        return push(element);
    }

    @Override
    public boolean offerLast(Integer element) {
        return offer(element);
    }

    @Override
    public Integer pollFirst() {
        return pop();
    }

    @Override
    public Integer peekFirst() {
        return peek();
    }
}
