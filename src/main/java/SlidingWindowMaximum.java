import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return nums;

        int length = nums.length;
        Deque<Integer> deque = new ArrayDeque<>();

        int[] ret = new int[length - k + 1];
        int counter = 0;

        for (int index = 0; index < length; index++) {

            // Deque is over-sized. Need to clean up the first element from deque.
            while (!deque.isEmpty() && deque.peekFirst() < index - k + 1) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[index]) {
                deque.pollLast();
            }

            deque.offer(index);

            if (index +1 >= k) {
                ret[counter++] = nums[deque.peek()];
            }
        }

        return ret;
    }

}
