package others;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompleteWordTest {

    CompleteWord inst = new CompleteWord();

    @Test
    public void complete() {
        String s = "search for jobs";
        assertEquals(s, inst.complete(s, s.length()));
        assertEquals("search", inst.complete(s, 6));
        assertEquals("search", inst.complete(s, 7));
        assertEquals("search for", inst.complete(s, 13));
        assertEquals("search for", inst.complete(s, s.length() - 1));
        assertNull(inst.complete(s, 3));

    }
}