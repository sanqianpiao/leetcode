public class NthUglyNumber {
    public int nthUglyNumber(int n) {
        int num = 1, nth = 1;
        while (true) {
            if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
                if (isUgly(num)) nth++;
            }
            if (nth == n) return num;
            num++;
        }
    }

    public boolean isUgly(int num) {
        int p = 2;
        while (p <= num) {
            if (num % p == 0 && p != 2 && p != 3 && p != 5) {
                return false;
            }
            p = nextPrime(p);
        }
        return true;
    }

    public int nextPrime(int n) {
        int p = n + 1, fact = 2;
        while (fact < p) {
            if (p % fact == 0) {
                p++;
                fact = 2;
            } else {
                fact++;
            }
        }
        return p;
    }
}
