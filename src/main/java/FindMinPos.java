import java.util.Arrays;

public class FindMinPos {
    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        if(A[A.length - 1] < 0) return 1;
        if(A[0] > 1) return 1;

        for(int i = 0; i < A.length - 1; i++) {
            if(A[i] < 0) continue;
            if(A[i + 1] - A[i] > 1) {
                return A[i] + 1;
            }
        }
        return A[A.length - 1] + 1;
    }

    public int solution2(int[] A) {
        int n = A.length;
        int N = 1000010;

        // To mark the occurrence of elements
        boolean[] present = new boolean[N];

        int maxele = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (A[i] > 0 && A[i] <= n)
                present[A[i]] = true;

            maxele = Math.max(maxele, A[i]);
        }

        for (int i = 1; i < N; i++)
            if (!present[i])
                return i;

        return maxele + 1;
    }

    public static void main(String[] args) {
        System.out.println(new FindMinPos().solution(new int[]{0}));
        System.out.println(new FindMinPos().solution(new int[]{-1}));
        System.out.println(new FindMinPos().solution(new int[]{-1, -2, 1}));
        System.out.println(new FindMinPos().solution(new int[]{1, 1}));
        System.out.println(new FindMinPos().solution(new int[]{1, 3}));
        System.out.println(new FindMinPos().solution(new int[]{1, 5}));
    }
}
