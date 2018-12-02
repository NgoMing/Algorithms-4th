package implementation;

import ADT.Stack;
import datastructure.Array;

import java.util.Iterator;

public class StackArray<Item> implements Stack<Item> {

    // Stores items of the stack
    Array<Item> items;

    /**
     * Constructor without param
     */
    public StackArray() {
        items = new Array<>();
    }

    @Override
    public void push(Item item) {
        items.addLastItem(item);
    }

    @Override
    public Item pop() {
        return items.removeLastItem();
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
        return new StackArrayIterator();
    }

    private class StackArrayIterator implements Iterator<Item> {

        int trackIndex = 0;

        @Override
        public boolean hasNext() {
            return trackIndex < items.size();
        }

        @Override
        public Item next() {
            return items.getAt(trackIndex ++);
        }
    }
}
