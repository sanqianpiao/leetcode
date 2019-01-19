import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharacter2Test {

    LongestSubstringWithoutRepeatingCharacter2 inst = new LongestSubstringWithoutRepeatingCharacter2();

    @Test
    public void lengthOfLongestSubstring() {
        int len = inst.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, len);
    }

    @Test
    public void lengthOfLongestSubstring2() {
        int len = inst.lengthOfLongestSubstring("aaaa");
        assertEquals(1, len);
    }
}