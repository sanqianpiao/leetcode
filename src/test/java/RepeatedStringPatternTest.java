import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringPatternTest {

    RepeatedStringPattern inst = new RepeatedStringPattern();

    @Test
    public void test1() {
        boolean aba = inst.repeatedSubstringPattern("aba");
        assertFalse(aba);

        aba = inst.repeatedSubstringPattern2("aba");
        assertFalse(aba);
    }

    @Test
    public void test2() {
        boolean aba = inst.repeatedSubstringPattern("aabaaba");
        assertFalse(aba);

        aba = inst.repeatedSubstringPattern2("aabaaba");
        assertFalse(aba);
    }

    @Test
    public void test3() {
        boolean aba = inst.repeatedSubstringPattern("abab");
        assertTrue(aba);

        aba = inst.repeatedSubstringPattern2("abab");
        assertTrue(aba);
    }
}