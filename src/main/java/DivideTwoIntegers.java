/**
 * https://leetcode.com/problems/divide-two-integers/
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;

        boolean neg = (dividend < 0) ^ (divisor < 0);
        long dd = Math.abs((long)dividend), ds = Math.abs((long)divisor);

        if (ds == 0) return Integer.MAX_VALUE;
        if (dd < ds) return 0;
        if (dd == ds) return neg ? -1 : 1;

        long res = helper(dd, ds);
        return neg ? (int) (-res < Integer.MIN_VALUE ? Integer.MIN_VALUE : -res) : (int) (res > Integer.MAX_VALUE ? Integer.MAX_VALUE :
                res);
    }

    public long helper(long dividend, long divisor) {
        if (dividend < divisor) return 0;
        long sum = divisor, multiple = 1;
        while ((sum + sum) <= dividend) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + helper(dividend - sum, divisor);
    }
}
