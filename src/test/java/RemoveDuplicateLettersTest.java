import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateLettersTest {

    RemoveDuplicateLetters inst = new RemoveDuplicateLetters();

    @Test
    public void removeDuplicateLetters() {
        String res = inst.removeDuplicateLetters("bcabc");
        assertEquals("abc", res);
    }
}