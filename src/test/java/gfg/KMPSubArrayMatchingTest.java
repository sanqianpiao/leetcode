package gfg;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class KMPSubArrayMatchingTest {

    KMPSubArrayMatching inst = new KMPSubArrayMatching();

    @Test
    public void search() {
        int[] arr = {1, 2, 3},
                sub = {2, 3};
        List<Integer> indices = inst.search(arr, sub);
        System.out.println(indices);
        assertArrayEquals(new int[]{1}, indices.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void search2() {
        int[] arr = {1, 2, 3},
                sub = {2, 2};
        List<Integer> indices = inst.search(arr, sub);
        assertArrayEquals(new int[]{}, indices.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void search3() {
        int[] arr = {1, 2, 3, 1, 2, 3},
                sub = {2, 3};
        List<Integer> indices = inst.search(arr, sub);
        assertArrayEquals(new int[]{1, 4}, indices.stream().mapToInt(Integer::intValue).toArray());
    }
}