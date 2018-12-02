package ADT;

/**
 * Queue ADT
 * @param <Item> type of items in the queue
 * @author ngoming
 */
public interface Queue<Item> extends Iterable<Item> {

    /**
     * Add an item
     * @param item item should be added
     */
    void enqueue(Item item);

    /**
     * Remove the least recently added item
     * @return removed item
     */
    Item dequeue();

    /**
     * Check empty status of the queue
     * @return true if empty, otherwise false
     */
    boolean isEmpty();

    /**
     * Size of the queue
     * @return number of items in the queue
     */
    int size();
}
