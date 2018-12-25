public class SearchForARange {
    public int[] search(int[] a, int target) {
        int index = bs(a, target, 0, a.length - 1);

        int left = index;
        while (left > -1) {
            int i = bs(a, target, 0, left - 1);
            if (i > -1) left = i;
            else break;
        }

        int right = index;
        while (right > -1) {
            int i = bs(a, target, index + 1, a.length - 1);
            if (i > -1) right = i;
            else break;
        }

        return new int[]{left, right};
    }

    public int bs(int[] a, int target, int lo, int hi) {
        int mid = 0;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (a[mid] == target) return mid;

            if (a[mid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }
}
