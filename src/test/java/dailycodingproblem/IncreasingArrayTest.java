package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class IncreasingArrayTest {

    IncreasingArray inst = new IncreasingArray();

    @Test
    public void removeOneElement() {
        int[] a = {1, 2, 3};
        assertEquals(a.length, inst.removeOneElement(a));

        int[] a2 = {3, 2, 1};
        assertEquals(0, inst.removeOneElement(a2));

        int[] a3 = {2, 3, 5, 3};
        assertEquals(2, inst.removeOneElement(a3));

        int[] a4 = {10, 1, 2, 3};
        assertEquals(1, inst.removeOneElement(a4));

        int[] a5 = {2, 1};
        assertEquals(2, inst.removeOneElement(a5));

        int[] a6 = {1, 2, 4, 2, 5, 6};
        assertEquals(2, inst.removeOneElement(a6));

        int[] a7 = {3, 1, 3, 1};
        assertEquals(0, inst.removeOneElement(a7));

        int[] a8 = {2, 1, 2, 3};
        assertEquals(2, inst.removeOneElement(a8));

        int[] a9 = {1, 2, 5, 1, 6, 7};
        assertEquals(1, inst.removeOneElement(a9));

        int[] a10 = {1, 2, 5, 1, 4, 7};
        assertEquals(0, inst.removeOneElement(a10));
    }
}