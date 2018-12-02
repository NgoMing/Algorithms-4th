package datastructure;

/**
 * Linked list - data structure
 * @param <Item> type of items in the list
 * @author ngoming
 */
public class LinkedList<Item> {

    /**
     * Class define node object
     */
    private class Node {
        // Stored item
        Item item;

        // Store address of the next node
        Node next;
    }

    // The first node of the list
    Node head;

    // The last node of the list
    Node tail;

    // Number items of the list
    int size;

    /**
     * Constructor without param
     */
    public LinkedList() {
        head = new Node();
        tail = head;
        size = 0;
    }

    /**
     * Add an item to the head of the list
     * @param item item should be added
     */
    public void addFirstItem(Item item) {
        if (isEmpty()) {
            head = new Node();
            head.item = item;
            tail = head;
        }
        else {
            Node oldHead = head;
            head = new Node();
            head.item = item;
            head.next = oldHead;
        }
        size++;
    }

    /**
     * Remove the head of the list
     * @return value of the item of the head
     */
    public Item removeFirstItem() {
        Item removedItem = head.item;
        head = head.next;
        size --;
        return removedItem;
    }

    /**
     * Remove the tail of the list
     * @return value of the item of the tail
     */
    public Item removeLastItem() {
        Node trackNode = head;
        // Find the node which is the previous node of tail
        while (trackNode.next != tail) {
            trackNode = trackNode.next;
        }
        Item removedItem = tail.item;
        trackNode.next = null;
        tail = trackNode;
        size --;
        return removedItem;
    }

    /**
     * Check empty status of the list
     * @return true if empty, otherwise false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Size of the list
     * @return number of items in the list
     */
    public int size() {
        return size;
    }
}
