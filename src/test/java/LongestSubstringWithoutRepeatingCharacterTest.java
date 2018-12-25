import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharacterTest {

    LongestSubstringWithoutRepeatingCharacter inst = new LongestSubstringWithoutRepeatingCharacter();

    @Test
    public void lengthOfLongestSubstring() {
        int i = inst.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, i);
    }
}