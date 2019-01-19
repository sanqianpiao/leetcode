package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class Islands2Test {

    Islands2 inst = new Islands2();

    @Test
    public void islands() {

        int[][] a = {
                {1, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {1, 1, 0, 0, 1}
        };

        int count = inst.islands(a);
        assertEquals(4, count);
    }

    @Test
    public void islands2() {
        int[][] a = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };
        int count = inst.islands(a);
        assertEquals(3, count);
    }

    @Test
    public void islands3() {
        int[][] a = {
                {1, 0, 1},
                {1, 0, 0},
                {0, 0, 1},
        };
        int count = inst.islands(a);
        assertEquals(3, count);
    }
}