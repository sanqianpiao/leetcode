package dailycodingproblem;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ShortestUniquePrefixTest {

    ShortestUniquePrefix inst = new ShortestUniquePrefix();

    @Test
    public void uniquePrefix() {
        List<String> words = Arrays.asList("dog", "cat", "apple", "apricot", "fish");
        List<String> strings = inst.uniquePrefix(words);
        assertArrayEquals(new String[]{"d", "c", "app", "apr", "f"}, strings.stream().toArray());
    }
}