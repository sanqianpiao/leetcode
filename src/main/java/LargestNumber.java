public class LargestNumber {
    String max = "";
    public String largestNumber(int[] nums) {
        helper(nums, "", -1, 0);
        return max;
    }

    public void helper(int[] nums, String comb, int exclude, int start) {
        if(start == nums.length) {
            max = comb.compareTo(max) > 1 ? comb : max;
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(i == exclude) continue;
            helper(nums, comb + ""+ nums[i], i, start + 1);
        }
    }
}
