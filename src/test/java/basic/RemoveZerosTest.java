package basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveZerosTest {

    RemoveZeros inst = new RemoveZeros();

    @Test
    public void remove() {
        int[] a = {1, 0, 2, 0, 3, 0};
        int j = inst.remove(a, a.length);
        assertEquals(3, j);

        int[] b = {1, 2, 3, 0, 0, 0};
        assertArrayEquals(b, a);
    }

    @Test
    public void remove2() {
        int[] a = {0, 0, 0, 0, 0, 0};
        int j = inst.remove(a, a.length);
        assertEquals(0, j);

        int[] b = {0, 0, 0, 0, 0, 0};
        assertArrayEquals(b, a);
    }
}