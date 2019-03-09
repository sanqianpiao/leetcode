package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceBetweenTwoWordsTest {

    DistanceBetweenTwoWords inst = new DistanceBetweenTwoWords();

    @Test
    public void distance() {
        String s = "dog cat hello cat dog dog hello cat world";
        int d = inst.distance(s, "hello", "world");
        assertEquals(1, d);
    }

    @Test
    public void distance2() {
        String s = "geeks for geeks contribute practice";
        int d = inst.distance(s, "practice", "geeks");
        assertEquals(1, d);
    }
}