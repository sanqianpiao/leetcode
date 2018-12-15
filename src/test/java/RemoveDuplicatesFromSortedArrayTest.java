import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray ins = new RemoveDuplicatesFromSortedArray();

    @Test
    public void removeDuplicates() {
        int[] a = {1, 1, 2};
        int len = ins.removeDuplicates(a);
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
        assertEquals(len, 2);
        assertEquals(1, a[0]);
        assertEquals(2, a[1]);
    }

    @Test
    public void removeDuplicates2() {
        int[] a = {1, 1, 2};
        int len = ins.removeDuplicates2(a);
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
        assertEquals(len, 2);
        assertEquals(1, a[0]);
        assertEquals(2, a[1]);
    }
}