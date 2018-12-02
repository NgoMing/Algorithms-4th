package implementation;

import ADT.Bag;
import datastructure.Array;

import java.util.Iterator;

/**
 * Implement Bag ADT using Array
 * @param <Item> type in items in the bag
 * @author ngoming
 */
public class BagArray<Item> implements Bag<Item> {

    // Store items of the bag
    Array<Item> items;

    /**
     * Constructor without param
     */
    public BagArray() {
        items = new Array<>();
    }

    @Override
    public void add(Item item) {
        items.addItem(item);
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public Iterator<Item> iterator() {
        return new BagArrayIterator();
    }

    private class BagArrayIterator implements Iterator<Item> {

        int trackIndex = 0;

        @Override
        public boolean hasNext() {
            return trackIndex < items.size();
        }

        @Override
        public Item next() {
            return items.getAt(trackIndex++);
        }
    }
}
