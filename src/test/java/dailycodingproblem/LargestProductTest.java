package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestProductTest {

    LargestProduct lp = new LargestProduct();

    @Test
    public void bruteForce() {
        int[] a = {-10, -10, 5, 2};
        int i = lp.bruteForce(a);
        assertEquals(500, i);
    }

    @Test
    public void onePass() {
        int[] a = {1, 2, 3, 4};
        int i = lp.onePass(a);
        assertEquals(24, i);
    }
}