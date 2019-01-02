import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInRotatedSortedArrayTest {

    SearchInRotatedSortedArray inst = new SearchInRotatedSortedArray();

    @Test
    public void search() {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        int idx = inst.search(a, 0);
        assertEquals(4, idx);
    }

    @Test
    public void search2() {
        int[] a = {1, 3};
        int idx = inst.search(a, 3);
        assertEquals(1, idx);
    }

    @Test
    public void search3() {
        int[] a = {5, 1, 3};
        int idx = inst.search(a, 5);
        assertEquals(0, idx);
    }

    @Test
    public void name() {
        int[] a = {3, 1, 1, 1};
        int idx = inst.minIndex(a);
        assertEquals(1, idx);
    }

    @Test
    public void search4() {
        int[] a = {3, 1, 1, 1};
        int idx = inst.search(a, 3);
        assertEquals(0, idx);
    }
}