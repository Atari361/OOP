package lesson7.collections;

/**
 * Created by pavlo.letskyi on 6/7/2017.
 */
public class Node {
    Integer elem;
    Node next;

    public Node(Integer elem, Node next) {
        this.elem = elem;
        this.next = next;
    }

    public Integer getElem() {
        return elem;
    }

    public void setElem(Integer elem) {
        this.elem = elem;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
