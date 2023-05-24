package edu.kis.vh.nursery.list;

/**
 * Linked List for integer.
 */
public class IntLinkedList {

    /**
     * Value if the Linked List is empty.
     */
    public static final Node EMPTY = null;
    public static final int ERROR = -1;
    /**
     * The Node that ends Linked List.
     */
    private Node last;
    private int i;

    /**
     * Adds number at the end of the Linked List.
     *
     * @param i The number which is added at the end of the Linked List.
     */
    public void push(int i) {
        if (last == EMPTY)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * @return The information if the Linked List is empty.
     */
    public boolean isEmpty() {
        return last == EMPTY;
    }

    /**
     * @return The information if the Linked List is full.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return The number at the end of the Linked List.
     */
    public int top() {
        if (isEmpty())
            return ERROR;
        return last.getValue();
    }

    /**
     * @return The number at the end of the Linked List.
     */
    public int pop() {
        if (isEmpty())
            return ERROR;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
