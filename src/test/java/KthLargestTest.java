import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestTest {

    KthLargest inst = new KthLargest();

    @Test
    public void findKthLargest() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = inst.findKthLargest(a, 3);
        assertEquals(7, i);
    }
}