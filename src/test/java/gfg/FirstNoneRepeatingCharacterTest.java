package gfg;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstNoneRepeatingCharacterTest {

    FirstNoneRepeatingCharacter inst = new FirstNoneRepeatingCharacter();

    @Test
    public void first() {
        int index = inst.first("GeeksforGeeks");
        assertEquals(5, index);
    }
}