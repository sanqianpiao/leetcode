package gfg;

public class KMPStringMatching {

    public int KMPSearch(String pat, String txt) {
        int N = txt.length(), M = pat.length(), i = 0, j = 0;
        int[] lps = computeLPSArray(pat);

        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                int index = i - M;
//                j = lps[j - 1];
                return index;
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        return -1;
    }

    public int[] computeLPSArray(String pat) {
        int len = pat.length();
        int lps[] = new int[len];
        int lo = 0, hi = 1;

        while (hi < len) {
            if (pat.charAt(hi) != pat.charAt(lo)) {

                if (lo == 0)
                    lps[hi++] = 0;
                else
                    lo = lps[lo - 1];

            } else {
                lo++;
                lps[hi++] = lo;
            }
        }
        return lps;
    }
}
