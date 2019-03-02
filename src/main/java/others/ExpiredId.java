package others;

import java.util.TreeMap;

/**
 * For example, 99% of numbers from 1 to Long.MAX_VALUE are expired.
 * Please find an efficient way to store those expired ids.
 */
public class ExpiredId {

    TreeMap<long[], Boolean> bst = new TreeMap<>((a, b) -> (int) (a[0] - b[0]));

    public void expire(long id) {

    }

    public boolean isExpired(long id) {
        return bst.get(id) != null;
    }

    private static int bs(int[] a, int target) {
        int lo = 0, hi = a.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) >> 1;
            if (a[mid] == target) return mid;
            if (a[mid] > target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] a = {1, 25, 29, 33};
        System.out.println(bs(a, 0));
    }
}
