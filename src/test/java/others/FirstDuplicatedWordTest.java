package others;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstDuplicatedWordTest {

    FirstDuplicatedWord inst = new FirstDuplicatedWord();

    @Test
    public void duplicatedWord() {
        String word = inst.duplicatedWord("ghi, def abc jkl abc ghi's");
        assertEquals("ghi", word);
    }
}