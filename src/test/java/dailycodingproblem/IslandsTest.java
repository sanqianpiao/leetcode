package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class IslandsTest {

    Islands inst = new Islands();

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
    public void name() {
        int[][] a = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1}
        };
        int count = inst.islands(a);
        assertEquals(3, count);
    }
}