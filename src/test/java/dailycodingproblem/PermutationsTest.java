package dailycodingproblem;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PermutationsTest {

    Permutations inst = new Permutations();

    @Test
    public void permutation() {
        int[] a = {1, 2, 3};
        List<List<Integer>> permutation = inst.permutation(a);
        System.out.println(permutation);
        assertEquals(6, permutation.size());
    }
}