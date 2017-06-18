package lesson9_homework;

/**
 * Created by letsk on 06/18/2017.
 */

public class LinkedDeque extends AbstractDeque{

    private Node lastNode;
    private Node firstNode;

    @Override
    public boolean push(Integer elem) {
        if (elem == null) return false;

        // Добавляет элемент в начало очереди.

        Node node = new Node(elem);
        if (firstNode != null){
            node.prev = firstNode;
            firstNode.next = node;
            firstNode = node;
        } else {
            firstNode = node;
            lastNode = node;
        }
        return true;
    }

    @Override
    public Integer pop() {

        // Возвращает и удаляет элемент из начала очереди.

        int result = firstNode.elem;
        firstNode = firstNode.prev;
        return result;
    }

    @Override
    public boolean offer(Integer el) {
        if (el == null) return false;

        // Добавляет элемент в конец очереди.

        Node node = new Node(el);
        if (lastNode != null){
            node.next = lastNode;
            lastNode.prev = node;
            lastNode = node;
        } else {
            firstNode = node;
            lastNode = node;
        }
        return true;
    }

    @Override
    public Integer peek() {

        //Возвращает элемент без удаления из начала очереди.

        return firstNode.elem;
    }

    @Override
    public Integer poll() {

        // Возвращает и удаляет элемент из начала очереди.

        return pop();
    }

    @Override
    public Integer peekLast() {
        return lastNode.elem;
    }

    @Override
    public Integer pollLast() {
        int result = lastNode.elem;
        lastNode = lastNode.next;
        return result;
    }

    class Node {
        private Integer elem;
        private Node prev;
        private Node next;

        public Node(Integer elem) {
            this.elem = elem;
        }

        public Node(Integer elem, Node nodeNext, Node nodePrev) {
            this.elem = elem;
            this.next = nodeNext;
            this.prev = nodePrev;
        }
    }
}
