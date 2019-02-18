import org.junit.Test;

import static org.junit.Assert.*;

public class _4SumIITest {

    _4SumII inst = new _4SumII();

    @Test
    public void fourSumCount() {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        assertEquals(2, inst.fourSumCount(A, B, C, D));
    }
}