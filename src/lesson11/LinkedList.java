package lesson11;

import java.util.Iterator;

/**
 * Created by dell on 6/20/2017.
 */
public class LinkedList implements List, Iterable<Integer> {

    private Node firstNode;
    private Node lastNode;
    private int size;

    @Override
    public void add(Integer el) {
        Node node = new Node(el);
        if (size > 0){
            node.next = lastNode;
            lastNode.prev = node;
            lastNode = node;
        } else {
            firstNode = node;
            lastNode = node;
        }
        size++;
    }

    @Override
    public void add(int idx, Integer el) {
        checkBounds(idx);
        Node node = new Node(el);
        Node target = getNodeByIndex(idx);
        node.prev = target;
        node.next = target.next;
        target.next.prev = node;
        target.next = node;
        size++;
    }

    @Override
    public Integer get(int idx) {
        checkBounds(idx);
        return getNodeByIndex(idx).elem;
    }

    @Override
    public Integer set(int idx, Integer el) {
        checkBounds(idx);
        Node node = new Node(el);
        Node target = getNodeByIndex(idx);
        node.prev = target.prev;
        node.next = target.next;
        target.next.prev = node;
        target.prev.next = node;
        size++;
        return target.elem;
    }

    @Override
    public Integer remove(int idx) {
        checkBounds(idx);
        if (idx == 0){
            firstNode = firstNode.prev;
            firstNode.next = null;
            size--;
            return firstNode.elem;
        } else if (idx == size){
            lastNode = lastNode.next;
            lastNode.prev = null;
            size--;
            return lastNode.elem;
        } else {
            Node target = getNodeByIndex(idx);
            target.next.prev = target.prev;
            target.prev.next = target.next;
            size--;
            return target.elem;
        }
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
        return indexOf(el) >= 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(Integer el) {
        Node temp = firstNode;
        for (int i = 0; i < size; i++){
            if (temp.elem.equals(el)) {
                return i;
            } else {
                temp = temp.prev;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        firstNode = lastNode = null;
    }

    @Override
    public String toString(){
        String result = "";
        Node temp = firstNode;
        for (int i = 0; i < size; i++){
            result += temp.elem + " ";
            temp = temp.prev;
        }
        return result;
    }

    private void checkBounds(int idx) {
        if (0 > idx | idx > size) throw new IndexOutOfBoundsException();
    }

    private Node getNodeByIndex(int idx){

        if (idx < size/2){
            Node temp = firstNode;
            for (int i = 0; i < idx; i++){
                temp = temp.prev;
            }
            return temp;
        } else {
            Node temp = lastNode;
            for (int i = size; i > idx; i--){
                temp = temp.next;
            }
            return temp;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iter = new Iterator<Integer>() {
            Node currentNode = firstNode;
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public Integer next() {
                int result = currentNode.elem;
                currentNode = currentNode.prev;
                return result;
            }
        };
        return iter;
    }

    class Node {
        private Integer elem;
        private Node prev;
        private Node next;

        public Node(Integer elem) {
            this.elem = elem;
        }
    }
}
