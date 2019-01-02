public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int p = minIndex(nums);
        if (p == 0) {
            return bs(nums, 0, nums.length - 1, target);
        } else {
            int left = bs(nums, 0, p - 1, target);
            int right = bs(nums, p, nums.length - 1, target);
            return Math.max(left, right);
        }
    }

    public int bs(int[] a, int lo, int hi, int target) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == target) return mid;
            else if (a[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public int minIndex(int[] a) {
        int lo = 0, hi = a.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < a[hi]) {
                hi = mid;
            } else if (a[mid] > a[hi]) {
                lo = mid + 1;
            } else {
                hi--;
            }
        }
        return lo;
    }
}
