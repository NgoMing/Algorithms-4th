package implementation;

import ADT.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueArrayTest {

    @Test
    public void shouldConstructWithoutParamCorrectly() throws Exception {
        Queue<Integer> integerQueue = new QueueArray<>();
        assertTrue(integerQueue.isEmpty());
        assertEquals(0, integerQueue.size());
    }

    @Test
    public void shouldEnqueueCorrectly() throws Exception {
        Queue<Integer> integerQueue = new QueueArray<>();
        integerQueue.enqueue(5);
        assertFalse(integerQueue.isEmpty());
        assertEquals(1, integerQueue.size());
    }

    @Test
    public void shouldDequeueCorrectly() throws Exception {
        Queue<Integer> integerQueue = new QueueArray<>();
        integerQueue.enqueue(5);
        Integer removedItem = integerQueue.dequeue();

        assertTrue(integerQueue.isEmpty());
        assertEquals(0, integerQueue.size());
        assertEquals((Integer)5, removedItem);
    }

    @Test
    public void shouldIterateCorrectly() throws Exception {
        Queue<Integer> integerQueue = new QueueArray<>();
        int index = 0;
        for (index = 0; index < 5; index ++)
            integerQueue.enqueue(index);

        index = 0;
        for (Integer i : integerQueue) {
            assertEquals((Integer)index, i);
            index ++;
        }
    }

}