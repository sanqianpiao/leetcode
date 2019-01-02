import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromicSubstringTest {

    PalindromicSubstring inst = new PalindromicSubstring();

    @Test
    public void countSubstrings() {
        assertEquals(3, inst.countSubstrings("abc"));
        assertEquals(6, inst.countSubstrings("aaa"));
    }
}