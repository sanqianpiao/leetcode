public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j] && j == len - 1) {
                    len = len - (j - i);
                    break;
                }
                if (nums[i] != nums[j] && j - i == 1) break;

                if (nums[i] != nums[j] && nums[i] == nums[j - 1]) {
                    copy(nums, i, j - 1, len - j + 1);
                    len = len - (j - i - 1);
                    i = 0;
                    break;
                }
            }
        }
        return len;
    }

    public void copy(int[] nums, int index1, int index2, int len) {
        for (int i = 0; i < len; i++) {
            nums[index1 + i] = nums[index2 + i];
        }
    }

    /**
     * This solution is much more elegant
     * @param nums
     * @return
     */
    public int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
