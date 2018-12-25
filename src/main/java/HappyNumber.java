import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    Set<Integer> set = new HashSet();

    public boolean isHappy(int n) {
        int result = 0;

        while (n > 0) {
            int digit = n % 10;
            result = result + digit * digit;
            n /= 10;
        }

        if (result == 1) return true;
        if (set.contains(result)) return false;
        set.add(result);
        return isHappy(result);
    }
}
