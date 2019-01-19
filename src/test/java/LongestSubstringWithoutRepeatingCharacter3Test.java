import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharacter3Test {

    LongestSubstringWithoutRepeatingCharacter3 inst = new LongestSubstringWithoutRepeatingCharacter3();

    @Test
    public void lengthOfLongestSubstring() {
        String str = "abccdef";
        assertEquals(4, inst.lengthOfLongestSubstring(str));
    }
}