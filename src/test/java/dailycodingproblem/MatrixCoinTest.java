package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCoinTest {

    MatrixCoin inst = new MatrixCoin();

    @Test
    public void max() {
        int[][] m = {
                {0, 3, 1, 1},
                {2, 0, 0, 4},
                {1, 5, 3, 1}
        };
        int r = inst.max(m);
        assertEquals(12, r);
    }
}