package itereator;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-20 11:42
 */
public class ListByLink<E> implements Collection_<E> {

    private int size=0;
    private Node<E> head;
    private Node<E> tail;
    public void add(E e) {
        Node<E> eNode = new Node<E>(e);
        if (head == null) {
            head = eNode;
            tail = head;
        } else {
            tail.next = eNode;
            tail = eNode;
        }
        size++;
    }

    public Iterator_ getItereator() {
        return new LinkedIte();
    }


    private class Node<E>{
        private E obj;
        private Node<E> next;


        public Node(E obj) {
            this.obj = obj;
        }


    }

    private class LinkedIte<E> implements Iterator_<E> {
        int index = 0;
        private Node<E> current;
        public boolean hasNext() {
            if (index < size) {
                index++;
                return true;
            } else {
                return false;
            }
        }

        public E getNext() {
            if (current == null) {
                current = (Node<E>) head;
            } else {
                current = current.next;
            }
            return  current.obj;
        }
    }

}
