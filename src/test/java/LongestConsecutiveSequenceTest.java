import org.junit.Test;

import static org.junit.Assert.*;

public class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence inst = new LongestConsecutiveSequence();

    @Test
    public void longestConsecutive() {
        int[] a = {1, 2, 3};
        int len = inst.longestConsecutive(a);
        assertEquals(3, len);
    }
}