public class MaximumSwap {

    public int maximumSwap(int num) {
        int[] a = toArr(num);
        int max = num;
        for (int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] >= a[j]) continue;
                int curr = assemble(swap(a, i, j));
                if(curr > max) max = curr;
            }
        }
        return max;
    }
    private int[] swap(int[] a, int i, int j) {
        int[] tmp = new int[a.length];
        System.arraycopy(a, 0, tmp, 0, a.length);
        int t = tmp[i];
        tmp[i] = tmp[j];
        tmp[j] = t;
        return tmp;
    }

    private int assemble(int[] a) {
        int sum = 0;
        for (int n : a) sum = sum * 10 + n;
        return sum;
    }

    private int[] toArr(int num) {
        String s = num + "";
        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = Integer.valueOf(s.substring(i, i + 1));
        }
        return a;
    }

}
