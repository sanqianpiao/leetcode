package dailycodingproblem;

/**
 * Given an array of integers in which two elements appear exactly once and all other elements appear exactly twice, find the two elements that appear only once.
 * <p>
 * For example, given the array [2, 4, 6, 8, 10, 2, 6, 10], return 4 and 8. The order does not matter.
 * <p>
 * Follow-up: Can you do this in linear time and constant space?
 */
public class TwoElementsAppearOnce {

    public int[] once(int[] a) {
        int mask = FindMask(a);
        System.out.println("mask: " + mask);
        int j = 0, k = 0;

        for (int i = 0; i < a.length; i++)
            if ((a[i] & mask) == 0) {
                j ^= a[i];
                System.out.println("& mask == 0: " + a[i]);
            } else {
                k ^= a[i];
                System.out.println("& mask != 0: " + a[i]);
            }

        return new int[]{j, k};
    }

    private int FindMask(int[] a) {

        int combined = 0;
        for (int i = 0; i < a.length; i++)
            combined ^= a[i];

        int mask = 1;
        while ((combined & mask) == 0)
            mask <<= 1;

        return mask;

    }
}
