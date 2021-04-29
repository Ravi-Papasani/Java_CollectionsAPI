package M_1_LinkedLists;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;


    // addLast
    public void addLast(int item) {
        //Node node = new Node(item);
        var node = new Node(item); // now this node has value with it.
        // if(first == null)
        if (isEmpty()) {
            first = last = node;
        } else {
            //add the node, after the last node and then (linking the last node to this new node)
            last.next = node;
            //update last to point to this new node
            last = node;
        }
    }

    // addFirst
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            first.next = node;
            first = node;
        }
    }

    // indexOf
    public int indexOf(int item) {
        int indexvalue = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return indexvalue;
            } else {
                current = current.next;
                indexvalue++;
            }

        }
        return -1;
    }

    // contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // deleteFirst/removeFirst
    public void removeFirst() {
        //validation
        if (isEmpty())
            throw new NoSuchElementException();

        //checking if the list has only one element
        if (first == last) {
            first = last = null;
            return;
        }

        //[10 -> 20 -> 30 -> 40]
        var second = first.next; //20 is now assign to second
        first.next = null; //it removes the link node now the list looks like [10   20 -> 30 -> 40]
        first = second; // updating the second to first now [20 -> 30 -> 40]
    }

    // DeleteLast/removeLast
    public void removeLast() {

        //validation
        if (isEmpty())
            throw new NoSuchElementException();

        //checking if the list has only one element
        if (first == last) {
            first = last = null;
            return;
        }

        //[10 -> 20 -> 30]
        /*
        checking if the node is the last node
         var current = first;
        while (current != null){
            if(current.next == last) break;
            current = current.next;
         }
        * */
        //[10 -> 20 -> 30]
        //previous -> 20
        //last -> 30 replace 20
        var previousOfLastNode = getPrevious(last);
        last = previousOfLastNode;
        last.next = null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
