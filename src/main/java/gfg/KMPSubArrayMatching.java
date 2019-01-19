package gfg;

import java.util.ArrayList;
import java.util.List;

public class KMPSubArrayMatching {

    public List<Integer> search(int[] arr, int[] sub) {
        int n = arr.length, i = 0, m = sub.length, j = 0;

        int[] lps = lps(sub);

        List<Integer> indices = new ArrayList<>();
        while (i < n) {
            if (arr[i] == sub[j]) {
                i++;
                j++;
            }

            // match
            if (j == m) {
                indices.add(i - m);
                j = lps[j - 1];
            }

            if (i < n && arr[i] != sub[j]) {
                if (j == 0) i++;
                else j = lps[j - 1];
            }
        }
        return indices;
    }

    public int[] lps(int[] sub) {
        int lo = 0, hi = 1;
        int[] lps = new int[sub.length];
        while (hi < sub.length) {
            if (sub[lo] == sub[hi]) {
                lo++;
                lps[hi++] = lo;
            } else {
                if (lo == 0) hi++;
                else lo = lps[lo - 1];
            }
        }

        return lps;
    }
}
