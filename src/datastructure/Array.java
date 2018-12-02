package datastructure;

/**
 * Array - data structure
 * @param <Item> type of item in the array
 * @author ngoming
 */
public class Array<Item> {

    // capacity default
    final static int CAPACITY_DEFAULT = 8;

    // collection of items
    Item[] items;

    // current number items
    int size;

    /**
     * Constructor without param
     */
    public Array() {
        items = (Item[]) new Object[CAPACITY_DEFAULT];
        size = 0;
    }

    /**
     * Get value of indexed item
     * @param index index of needed item
     * @return value of the item
     */
    public Item getAt(int index) {
        return items[index];
    }

    /**
     * Add item at the end of the array
     * @param value value should be set to the specific item
     */
    public void addItem(Item value) {
        items[size] = value;
        size ++;
    }

    /**
     * Check empty status of the array
     * @return true if empty, otherwise false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Size of the array
     * @return number of items in the array
     */
    public int size() {
        return size;
    }
}
