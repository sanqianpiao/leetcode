package dailycodingproblem;

public class IncreasingArray {

    public int removeOneElement(int[] a) {
        if (a == null || a.length == 0) return 0;
        if (a.length == 1) return 1;
        if (a.length == 2 && a[0] > a[1]) return 2;

        int count = 0;
        int valleyIndex = 0, valleyValue = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                valleyIndex = i;
                valleyValue = a[i];
                count++;
                if (i > 1) {
                    a[i] = a[i - 1];
                }
            }
            if (count == 2) return 0;
        }
        if (count == 0) return a.length;

        if (valleyIndex != 1 && valleyIndex != a.length - 1) {
            if (valleyValue < a[valleyIndex - 2]) return 1;
            return 2;
        }

        if (valleyIndex == 1) {
            if (a[valleyIndex + 1] < a[valleyIndex - 1]) return 1;
            else return 2;
        }

        if (valleyIndex == a.length - 1) {
            if (valleyValue >= a[valleyIndex - 2]) return 2;
            else return 1;
        }

        return 0;
    }
}
