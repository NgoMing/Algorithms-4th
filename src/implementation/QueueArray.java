package implementation;

import ADT.Queue;
import datastructure.Array;

import java.util.Iterator;

/**
 * Implement Queue ADT using array
 * @param <Item> type of items in the queue
 * @author ngoming
 */
public class QueueArray<Item> implements Queue<Item> {

    // Store items of the queue
    Array<Item> items;

    /**
     * Constructor without param
     */
    public QueueArray() {
        items = new Array<>();
    }

    @Override
    public void enqueue(Item item) {
        items.addItem(item);
    }

    @Override
    public Item dequeue() {
        return items.removeItem();
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
        return new QueueArrayIterator();
    }

    private class QueueArrayIterator implements Iterator<Item> {

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
