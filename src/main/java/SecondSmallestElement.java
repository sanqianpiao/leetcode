import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SecondSmallestElement {

    public int secondSmallest(int[] a) {
        PriorityQueue<Integer> q = new PriorityQueue<>((v1, v2) -> v2 - v1);
        Set<Integer> set = new HashSet<>();
        for (int n : a) {
            if(set.contains(n)) continue;
            else set.add(n);

            if (q.size() >= 2) {
                if (q.peek() >= n) {
                    q.poll();
                    q.offer(n);
                }
            } else {
                q.offer(n);
            }
        }

        return q.size() == 2 ? q.peek() : -1;
    }
}
