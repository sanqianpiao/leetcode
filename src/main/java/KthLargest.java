import java.util.PriorityQueue;

public class KthLargest {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            if (q.size() < k) q.offer(nums[i]);

            else if (q.peek() < nums[i]) {
                q.poll();
                q.offer(nums[i]);
            }
        }

        return q.peek();

    }
}
