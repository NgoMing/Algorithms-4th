package datastructure;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {

    @Test
    public void shouldConstructorWithoutParamCorrectly() throws Exception {
        Array<Integer> array = new Array<>();
        assertEquals(0, array.size());
        assertTrue(array.isEmpty());
    }

    @Test
    public void shouldAddItemCorrectly() throws Exception {
        Array<Integer> array = new Array<>();
        array.addItem(5);
        assertEquals(1, array.size());
        assertFalse(array.isEmpty());
    }
}