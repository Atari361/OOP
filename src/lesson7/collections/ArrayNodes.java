package lesson7.collections;

/**
 * Created by pavlo.letskyi on 6/7/2017.
 */
public class ArrayNodes implements Stack{

    private Node lastNode;

    @Override
    public boolean push(int elem) {
        Node newLastNode = new Node(elem);
        newLastNode.setPrev(lastNode);
        lastNode = newLastNode;
        return true;
    }

    @Override
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

    @Override
    public int size() {
        int i = 0;
        Node lastNodeCopy = lastNode;
        while (lastNodeCopy != null){
            lastNodeCopy = lastNodeCopy.getPrev();
            i++;
        }
        return i;
    }

    public Node getLastNode() {
        return lastNode;
    }
}
