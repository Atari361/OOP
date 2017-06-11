package lesson7.collections;

/**
 * Created by pavlo.letskyi on 6/7/2017.
 */
public class Node {
    private Integer elem;
    private Node prev;

    public Node(Integer elem) {
        this.elem = elem;
    }

    public Integer getElem() {
        return elem;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
