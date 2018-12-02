package datastructure;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void shouldConstructWithoutParamCorrectly() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        assertTrue(linkedList.isEmpty());
        assertEquals(0, linkedList.size());
    }

    @Test
    public void shouldAddFirstItemCorrectly() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirstItem(5);
        assertEquals(1, linkedList.size());
    }

    @Test
    public void shouldRemoveFirstItemCorrectly() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirstItem(5);
        linkedList.addFirstItem(6);
        linkedList.addFirstItem(7);

        assertEquals(3, linkedList.size());
        assertEquals((Integer)7, linkedList.removeFirstItem());
        assertEquals(2, linkedList.size());
    }

    @Test
    public void shouldRemoveLastItemCorrectly() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirstItem(5);
        linkedList.addFirstItem(6);
        linkedList.addFirstItem(7);

        assertEquals(3, linkedList.size());
        assertEquals((Integer)5, linkedList.removeLastItem());
        assertEquals(2, linkedList.size());
    }
}