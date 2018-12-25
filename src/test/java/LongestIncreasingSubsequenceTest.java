import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {

    LongestIncreasingSubsequence inst = new LongestIncreasingSubsequence();

    @Test
    public void lengthOfLIS() {
        int[] a = {10, 9, 2, 5, 3, 4};
        int i = inst.lengthOfLIS(a);
        assertEquals(3, i);
    }

    @Test
    public void name() {
        int[] a = {1,3,6,7,9,4,10,5,6};
        int i = inst.lengthOfLIS(a);
        assertEquals(6, i);
    }
}