package basic;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SlidingWindowMaximumTest {

    SlidingWindowMaximum inst = new SlidingWindowMaximum();

    @Test
    public void max() {
        int[] a = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        List<Integer> max = inst.max(a, 3);
        System.out.println(max);
        assertArrayEquals(new Integer[]{3, 3, 4, 5, 5, 5, 6}, max.toArray(new Integer[]{}));
    }
}