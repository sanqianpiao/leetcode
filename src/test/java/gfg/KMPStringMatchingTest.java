package gfg;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KMPStringMatchingTest {

    KMPStringMatching inst = new KMPStringMatching();

    @Test
    public void KMPSearch() {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        int idx = inst.KMPSearch(pat, txt);
        assertEquals(txt.indexOf(pat), idx);
    }

    @Test
    public void lpsTest() {
        int[] lps = inst.computeLPSArray("ABXAB");
        System.out.println(Arrays.toString(lps));

        lps = inst.computeLPSArray("aaaabaacd");
        System.out.println(Arrays.toString(lps));

        lps = inst.computeLPSArray("abcdabca");
        System.out.println(Arrays.toString(lps));

        lps = inst.computeLPSArray("abacb");
        System.out.println(Arrays.toString(lps));
    }
}