public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int i = 0;
        while (i < len) {
            if (nums[i] == 0) {
                swap2End(nums, i, len - 1);
                len--;
                i = 0;
            } else {
                i++;
            }
        }
    }

    private void swap2End(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            swap(nums, i, i + 1);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
