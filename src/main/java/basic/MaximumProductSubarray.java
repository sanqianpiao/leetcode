package basic;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int global = Integer.MIN_VALUE, max = 1, min = 1;

        for (int n : nums) {
            if (n > 0) {
                max = max * n;
                min = Math.min(min * n, 1);
            } else if (n == 0) {
                max = 0;
                min = 1;
            } else {
                int t = max;
                max = min * n;
                min = t * n;
            }
            global = Math.max(max, global);

            if (max <= 0) max = 1;
        }

        return global;
    }
}
