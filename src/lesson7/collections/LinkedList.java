package lesson7.collections;

/**
 * Created by pavlo.letskyi on 6/7/2017.
 */
public class LinkedList implements Stack{

    private Node lastNode;

    @Override
    public boolean push(Integer elem) {
        lastNode = new Node(elem, lastNode);
        return true;
    }

    public boolean empty() {
        return lastNode == null;
    }

    @Override
    public Integer pop() {
        int result = lastNode.getElem();
        lastNode = lastNode.getPrev();
        return result;
    }

    @Override
    public Integer peek() {
        return lastNode.getElem();
    }


    public int size() {
        int i = 0;
        Node lastNodeCopy = lastNode;
        while (lastNodeCopy != null){
            lastNodeCopy = lastNodeCopy.getPrev();
            i++;
        }
        return i;
    }

    @Override
    public String toString(){
        int i = size();
        String result = "";
        Node lastNodeCopy = lastNode;
        while (lastNodeCopy != null){
            result += "Element #" + i-- + " = " + lastNodeCopy.getElem() + "\n";
            lastNodeCopy = lastNodeCopy.getPrev();
        }
        return result;
    }

    private class Node {
        private Integer elem;
        private Node prev;

        public Node(Integer elem, Node node) {
            this.elem = elem;
            setPrev(node);
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
}
