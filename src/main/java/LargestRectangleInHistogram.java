/**
 *  https://leetcode.com/problems/largest-rectangle-in-histogram/
 *
 *  Example:
 *
 * Input: [2,1,5,6,2,3]
 * Output: 10
 */
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int len = heights.length;
        for (int i = 0; i < len; i++) {
            int a = heights[i];
            max = Math.max(max, a);
            int min = a;
            for (int j = i + 1; j < len; j++) {
                int b = heights[j];
                min = Math.min(min, b);
                max = Math.max(max, min * (j - i + 1));
            }
        }
        return max;
    }
}
