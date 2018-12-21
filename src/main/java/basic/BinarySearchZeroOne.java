package basic;

public class BinarySearchZeroOne {

    /**
     * @param a a sorted array with only 0 and 1 elements
     * @return
     */
    public int findFirstOne(int[] a) {
        if (a[0] == 1) return 0;
        if (a[a.length - 1] == 0) return -1;

        int lo = 0, hi = a.length - 1, mid = 0;
        while (lo < hi) {
            mid = (lo + hi) / 2;
            if (a[mid] == 0) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
