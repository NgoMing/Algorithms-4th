package ADT;

/**
 * Stack ADT
 * @param <Item> type of item in the stack
 * @author ngoming
 */
public interface Stack<Item> extends Iterable<Item> {

    /**
     * Add an item
     * @param item item should be added
     */
    void push(Item item);

    /**
     * Remove the most recently added item
     * @return value of the item
     */
    Item pop();

    /**
     * Check empty status of the stack
     * @return true if empty, otherwise false
     */
    boolean isEmpty();

    /**
     * Size of the stack
     * @return number items in the stack
     */
    int size();
}
