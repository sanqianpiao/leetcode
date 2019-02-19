import org.junit.Test;

import static org.junit.Assert.*;

public class LargestRectangleInHistogramTest {

    LargestRectangleInHistogram inst = new LargestRectangleInHistogram();

    @Test
    public void largestRectangleArea() {
        int[] a = {2, 1, 5, 6, 2, 3};
        assertEquals(10, inst.largestRectangleArea(a));

    }
}