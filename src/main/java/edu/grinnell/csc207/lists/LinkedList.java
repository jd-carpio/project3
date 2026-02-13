package edu.grinnell.csc207.lists;

/**
 * A linked implementation of the list ADT.
 */
public class LinkedList {

    private static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        
        /**
         * 
             * @param value gives a value to the node
         */
        public Node(int value) {
            this(value, null);
        }
    }

    private Node first;

    public LinkedList() {
        first = null;
    }


    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        Node newNode = new Node(value,null);
        if (this.first == null) {
            this.first = newNode;
        } else {
            Node current = this.first;
            for(; current.next == null; current = current.next);
            current.next =newNode;
        }
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        int count = 0;
        if (this.first == null) {
            count = 0;
        } else {
            for(Node current = this.first; current.next == null; current = current.next);
            count++;
        }
        return count;
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}