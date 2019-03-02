package dailycodingproblem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoElementsAppearOnceTest {

    TwoElementsAppearOnce inst = new TwoElementsAppearOnce();

    @Test
    public void once() {
        int[] a = {2, 4, 6, 8, 10, 2, 6, 10};
        int[] once = inst.once(a);
        Arrays.sort(once);
        assertArrayEquals(new int[]{4, 8}, once);
    }
}
