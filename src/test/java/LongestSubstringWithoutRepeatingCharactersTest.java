import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters inst = new LongestSubstringWithoutRepeatingCharacters();

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