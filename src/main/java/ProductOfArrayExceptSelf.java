/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 *
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        final int[] result = new int[nums.length];
        for (int i = 0, leftProduct = 1; i < nums.length; i++) { // left product
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        for (int i = nums.length - 1, rightProduct = 1; i >= 0; i--) { // right product
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }
}
