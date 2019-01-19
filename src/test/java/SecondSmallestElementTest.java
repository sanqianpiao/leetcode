import org.junit.Test;

import static org.junit.Assert.*;

public class SecondSmallestElementTest {

    SecondSmallestElement inst = new SecondSmallestElement();

    @Test
    public void secondSmallest() {
        int[] a = {2, 2, 2};
        assertEquals(-1, inst.secondSmallest(a));

        int[] a2 = {2, 2, 5, 5, 7};
        assertEquals(5, inst.secondSmallest(a2));

        int[] a3 = {5, 8, 5};
        assertEquals(8, inst.secondSmallest(a3));
    }
}