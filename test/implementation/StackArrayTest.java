package implementation;

import ADT.Stack;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackArrayTest {

    @Test
    public void shouldConstructWithoutParamCorrectly() throws Exception {
        Stack<Integer> integerStack = new StackArray<>();
        assertTrue(integerStack.isEmpty());
        assertEquals(0, integerStack.size());
    }

    @Test
    public void shouldPushCorrectly() throws Exception {
        Stack<Integer> integerStack = new StackArray<>();
        integerStack.push(5);
        integerStack.push(4);

        assertFalse(integerStack.isEmpty());
        assertEquals(2, integerStack.size());
    }

    @Test
    public void shouldPopCorrectly() throws Exception {
        Stack<Integer> integerStack = new StackArray<>();
        integerStack.push(5);
        integerStack.push(4);
        Integer removedItem = integerStack.pop();

        assertEquals((Integer)4, removedItem);
    }

    @Test
    public void shouldIterateCorrectly() throws Exception {
        Stack<Integer> integerStack = new StackArray<>();
        int index = 0;
        for (index = 0; index < 5; index ++) {
            integerStack.push(index);
        }

        index = 0;
        for (Integer i : integerStack) {
            assertEquals((Integer)index ++, i);
        }
    }
}