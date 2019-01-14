import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SlidingWindowMaximumTest {

    SlidingWindowMaximum inst = new SlidingWindowMaximum();

    @Test
    public void max() {
        int[] a = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int[] max = inst.maxSlidingWindow(a, 3);
        System.out.println(max);
        assertArrayEquals(new int[]{3, 3, 4, 5, 5, 5, 6}, max);
    }
}