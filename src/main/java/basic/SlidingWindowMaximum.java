package basic;

import java.util.*;

public class SlidingWindowMaximum {

    public List<Integer> max(int[] a, int k) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>((i, j) -> i > j ? -1 : 1);
        for (int i = 0; i < k; i++) {
            q.offer(a[i]);
        }
        res.add(q.peek());
        for (int i = k; i < a.length; i++) {
            q.offer(a[i]);
            res.add(q.peek());
        }
        return res;
    }
}
