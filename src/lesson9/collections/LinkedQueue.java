package lesson9.collections;

import java.util.NoSuchElementException;

/**
 * Created by dell on 6/13/2017.
 */
public class LinkedQueue extends AbstractQueue {

    private Node head;
    private Node tail;
    private int size;


    public boolean add(Integer el) {
        if (el == null) return false;

        Node node = new Node(el);
        if (head != null){
            tail.next = node;
            tail = node;
//            tail = tail.next = node;
        } else {
            tail = node;
            head = node;
//            head = tail = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean offer(Integer el) throws NullPointerException {
        if (el == null){
            throw new NullPointerException();
        } else {
            return add(el);
        }
    }


    public Integer remove() {
        int result = head.elem;
        head = head.next;
        size--;
        return result;
    }

    @Override
    public Integer poll() throws NoSuchElementException {
        if (head == null){
            throw new NoSuchElementException();
        } else {
            return remove();
        }
    }


    public Integer element() {
        return head.elem;
    }

    @Override
    public Integer peek() {
        if (head == null){
            throw new NoSuchElementException();
        } else {
            return head.elem;
        }
    }


    public int size() {
        return this.size;
    }


    public void clear() {
        head = tail = null;
    }


    public Integer[] toArray() {
        Integer[] arr = new Integer[size];
        Node copyHead = head;
        for (int i = 0; i < size; i++){
            arr[i] = copyHead.elem;
            copyHead = copyHead.next;
        }
        return arr;
    }

    @Override
    public String toString(){
        String result = "";
        Node copyHead = head;
        int i=1;
        while (copyHead != null){
            result += "Element #" + i++ + " = " + copyHead.elem + "\n";
            copyHead = copyHead.next;
        }
        return result;
    }

    private class Node {
        private Integer elem;
        private Node next;

        public Node(Integer elem) {
            this.elem = elem;
        }

        public Node(Integer elem, Node node) {
            this.elem = elem;
            this.next = node;
        }

    }
}
