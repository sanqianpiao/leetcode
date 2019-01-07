import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeIITest {

    ValidPalindromeII inst = new ValidPalindromeII();

    @Test
    public void validPalindrome() {
        boolean b = inst.validPalindrome("abcdcb");
        assertTrue(b);
    }
}