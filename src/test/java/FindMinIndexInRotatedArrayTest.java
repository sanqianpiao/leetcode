import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinIndexInRotatedArrayTest {

    FindMinIndexInRotatedArray inst = new FindMinIndexInRotatedArray();

    @Test
    public void minIndex() {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        int index = inst.minIndex(a);
        assertEquals(4, index);
    }

    @Test
    public void minIndex2() {
        int[] a = {0, 1, 2};
        int index = inst.minIndex(a);
        assertEquals(0, index);
    }
}