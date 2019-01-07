import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {

    PlusOne inst = new PlusOne();

    @Test
    public void plusOne() {
        int[] a = {9, 9, 9};
        int[] ints = inst.plusOne(a);
        int[] res = {1, 0, 0, 0};
        assertArrayEquals(res, ints);
    }

    @Test
    public void plusOne2() {
        int[] a = {1, 2, 3};
        int[] ints = inst.plusOne(a);
        int[] res = {1, 2, 4};
        assertArrayEquals(res, ints);
    }

    @Test
    public void plusOne3() {
        int[] a = {1, 2, 9};
        int[] ints = inst.plusOne(a);
        int[] res = {1, 3, 0};
        assertArrayEquals(res, ints);
    }
}