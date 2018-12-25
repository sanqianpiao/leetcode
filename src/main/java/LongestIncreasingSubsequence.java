import java.util.LinkedList;

public class LongestIncreasingSubsequence {
    int max = 0;

    public int lengthOfLIS(int[] nums) {
        helper(nums, new LinkedList<>(), 0);
        return max;
    }

    private void helper(int[] nums, LinkedList<Integer> comb, int startIndex) {
        if (startIndex == nums.length) {
            max = Math.max(max, comb.size());
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            boolean added = false;
            if (comb.isEmpty() || comb.getLast() < nums[i]) {
                comb.add(nums[i]);
                added = true;
            }

            helper(nums, comb, i + 1);
            if (added) comb.removeLast();
        }
    }
}
