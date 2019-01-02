import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumTest {

    ThreeSum inst = new ThreeSum();

    @Test
    public void threeSum() {
        int[] a = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = inst.threeSum(a);
        assertEquals(2, lists.size());
    }

    @Test
    public void threeSum2() {
        int[] a = {0, 0, 0, 0};
        List<List<Integer>> lists = inst.threeSum(a);
        assertEquals(1, lists.size());
    }

    @Test
    public void threeSum3() {
        int[] a = {0, 2, 2, 3, 0, 1, 2, 3, -1, -4, 2};
        List<List<Integer>> lists = inst.threeSum(a);
        assertEquals(3, lists.size());
    }
}