import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 *
 * Example 1:
 *
 * Input:  [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 * Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
 * Example 2:
 *
 * Input:  [0,2,3,4,6,8,9]
 * Output: ["0","2->4","6","8->9"]
 * Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        if(nums == null || nums.length == 0) return Collections.emptyList();

        List<String> list = new ArrayList<>();
        int start = nums[0], end = start;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] - end == 1 || nums[i] - end == 0) {
                end = nums[i];
            } else {
                merge(start, end, list);
                start = nums[i];
                end = start;
            }

            if(i == nums.length - 1) {
                merge(start, end, list);
            }
        }
        return list;
    }

    public void merge(int start, int end, List<String> list) {
        if(start == end) {
            list.add(start + "");
        } else {
            list.add(start + "->" + end);
        }
    }
}
