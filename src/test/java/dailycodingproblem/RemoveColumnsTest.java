package dailycodingproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveColumnsTest {

    RemoveColumns inst = new RemoveColumns();

    @Test
    public void remove() {
        int remove = inst.remove(new char[][]{{'a', 'b', 'c', 'd', 'e'}});
        assertEquals(0, remove);
    }

    @Test
    public void remove2() {
        int remove = inst.remove(new char[][]{
                {'c', 'b', 'a'},
                {'d', 'a', 'f'},
                {'g', 'h', 'i'}
        });
        assertEquals(1, remove);
    }

    @Test
    public void remove3() {
        int remove = inst.remove(new char[][]{
                "zyx".toCharArray(),
                "wvu".toCharArray(),
                "tsr".toCharArray()
        });
        assertEquals(3, remove);
    }
}