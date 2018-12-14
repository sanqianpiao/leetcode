package dailycodingproblem;

import java.util.Arrays;

/**
 * This problem was asked by Facebook.
 * <p>
 * Given a list of integers, return the largest product that can be made by multiplying any three integers.
 * <p>
 * For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.
 * <p>
 * You can assume the list has at least three integers.
 */
public class LargestProduct {

    /**
     * Time Complexity is O( N ^ 3)
     *
     * @param a
     * @return
     */
    public int bruteForce(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    max = Math.max(a[i] * a[j] * a[k], max);
                }
            }
        }
        return max;
    }

    /**
     * Time Complexity is O( N LogN )
     *
     * @param a
     * @return
     */
    public int sort(int[] a) {
        Arrays.sort(a);
        int len = a.length;
        return Math.max(a[0] * a[1] * a[len - 1], a[len - 3] * a[len - 2] * a[len - 1]);
    }

    public int onePass(int[] a) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE,
                max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int n : a) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {
                min2 = n;
            }

            if (n >= max3) {
                max1 = max2;
                max2 = max3;
                max3 = n;
            } else if (n >= max2) {
                max1 = max2;
                max2 = n;
            } else if (n >= max1) {
                max1 = n;
            }
        }

        return Math.max(min1 * min2 * max3, max1 * max2 * max3);
    }


}
