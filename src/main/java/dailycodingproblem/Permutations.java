package dailycodingproblem;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a number in the form of a list of digits, return all possible permutations.
 * <p>
 * For example, given [1,2,3], return [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]].
 */
public class Permutations {
    public List<List<Integer>> permutation(int[] a) {
        List<List<Integer>> ps = new ArrayList<>();
        helper(ps, new ArrayList<>(), a);
        return ps;
    }

    public void helper(List<List<Integer>> ps, List<Integer> p, int[] a) {
        if (p.size() == a.length) {
            ps.add(new ArrayList<>(p));
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (p.contains(a[i]) == false)
                p.add(a[i]);
            else continue;
            helper(ps, p, a);
            p.remove(p.size() - 1);
        }
    }
}
