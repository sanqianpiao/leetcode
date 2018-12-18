import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    ValidPalindrome vp = new ValidPalindrome();

    @Test
    public void isPalindrome() {
        boolean op = vp.isPalindrome("0P");
        assertFalse(op);
    }
}