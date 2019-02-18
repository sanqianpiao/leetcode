package others;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GroupsTest {

    Groups isnt = new Groups();

    @Test
    public void group() {
        List<List<Character>> groups = isnt.group(new char[]{'a', 'b', 'a', 'b', 'c', 'a'});
        System.out.println(groups);
        assertEquals(3, groups.size());
    }

    @Test
    public void group2() {
        List<List<Character>> groups = isnt.group(new char[]{'a', 'b', 'a', 'b', 'b', 'a'});
        System.out.println(groups);
        assertEquals(3, groups.size());
    }
}