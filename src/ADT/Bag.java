package ADT;

/**
 * Bag ADT
 * @param <Item> type of item in Bag
 * @author ngoming
 */
public interface Bag<Item> extends Iterable<Item> {

    /**
     * Add an item into the bag
     * @param item item should be added
     */
    void add(Item item);

    /**
     * Check empty status of the bag
     * @return true if empty. otherwise false
     */
    boolean isEmpty();

    /**
     * Size of the bag
     * @return number of items in the bags
     */
    int size();
}
