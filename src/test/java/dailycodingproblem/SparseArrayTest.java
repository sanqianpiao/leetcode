package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SparseArrayTest {

    @Test
    public void name() {
        int[] a = new int[1000];
        a[10] = 1;
        a[20] = 2;
        a[30] = 3;

        SparseArray sa = new SparseArray(a, 2000);
        assertEquals(1, sa.get(10));
        assertEquals(2, sa.get(20));
        assertEquals(3, sa.get(30));
        assertEquals(0, sa.get(1000));
    }
}