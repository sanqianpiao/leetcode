package others;

/**
 * "1234&euro;"	=>	&euro;4321"
 * "1234&euro"	=>	"orue&4321"
 * "1234&euro;567"	=>	"765&euro;4321"
 * "aaa;aaa&amp;bbb;;;" => ";;;bbb&amp;aaa;aaa"
 */
public class ReverseStringAndHTMLEntity {

    public String reverse(String s) {
        char[] a = s.toCharArray();
        int lo = 0, hi = a.length - 1;
        swap(a, lo, hi);

        lo = -1;
        hi = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ';') {
                lo = i;
            } else if (lo > -1 && a[i] == '&' && i > lo) {
                hi = i;

                if (hi - lo > 2) {
                    swap(a, lo, hi);
                    lo = -1;
                    hi = -1;
                }
            }
        }
        return new String(a);
    }

    public void swap(char[] a, int lo, int hi) {
        while (lo < hi) {
            char t = a[lo];
            a[lo] = a[hi];
            a[hi] = t;
            lo++;
            hi--;
        }
    }
}
