import org.junit.Test;

import static org.junit.Assert.*;

public class SearchForARangeTest {

    SearchForARange inst = new SearchForARange();
    @Test
    public void search() {
        int[] a = {5, 7, 7, 8, 8, 10};
        int[] search = inst.search(a, 8);
        assertArrayEquals(new int[]{3,4}, search);
    }
}