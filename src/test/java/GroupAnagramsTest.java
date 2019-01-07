import org.junit.Test;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    GroupAnagrams inst = new GroupAnagrams();

    @Test
    public void groupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        inst.groupAnagrams(strs);
    }
}