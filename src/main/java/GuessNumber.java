public class GuessNumber {

    int target;
    int count;

    public GuessNumber(int target) {
        this.target = target;
    }

    public int guess(int n) {
        return n == target ? 0 : n < target ? -1 : 1;
    }

    public int guessNumber(int n) {
        int lo = 1, hi = n, mid = 0;

        while (lo <= hi) {

            count++;

            mid = lo + (hi - lo) / 2;
            int res = guess(mid);
            if (res == 0) return mid;
            if (res == -1) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }
}
