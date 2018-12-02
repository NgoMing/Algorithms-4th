package implementation;

import ADT.Bag;
import org.junit.Test;

import static org.junit.Assert.*;

public class BagArrayTest {

    @Test
    public void shouldConstructWithoutParamCorrectly() throws Exception {
        Bag<Integer> integerBag = new BagArray<>();
        assertEquals(0, integerBag.size());
        assertTrue(integerBag.isEmpty());
    }

    @Test
    public void shouldAddItemCorrectly() throws Exception {
        Bag<Integer> integerBag = new BagArray<>();
        integerBag.add(24);
        assertEquals(1, integerBag.size());
        assertFalse(integerBag.isEmpty());
    }
}