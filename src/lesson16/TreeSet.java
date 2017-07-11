package lesson16;

import java.util.Comparator;
import java.util.List;

/**
 * Created by dell on 7/11/2017.
 */
public class TreeSet<E> implements Set<E> {

    Node<E> root;
    int size;

    private class Node<E> implements Comparable<E>{
        private E elem;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        public Node(E elem) {
            this.elem = elem;
        }

        public Node(E elem, Node<E> parent, Node<E> left, Node<E> right) {
            this.elem = elem;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(E o) {
            return (int)o - (int)elem ;
        }
    }

    @Override
    public boolean add(E element) {
        Node<E> nd = new Node<>(element);
        if (root == null){
            root = nd;
            return true;
        } else {
            return compare(nd, root);
        }
    }

    private boolean compare(Node<E> nd, Node<E> node) {
        if (nd.compareTo(node.elem) > 0 && node.right == null){
            node.right = nd;
            return true;
        } else if (nd.compareTo(node.elem) < 0 && node.left == null){
            node.left = nd;
            return true;
        } else if (nd.compareTo(node.elem) > 0){
            compare(nd, node.right);
        } else if (nd.compareTo(node.elem) < 0){
            compare(nd, node.left);
        }
        return false;
    }

    @Override
    public boolean contains(E elem) {
        return false;
    }

    @Override
    public boolean remove(E elem) {
        return false;
    }

    @Override
    public List<E> toList() {
        return null;
    }
}
