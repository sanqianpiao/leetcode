import java.util.ArrayList;
import java.util.List;

/**
 * Example:
 * <p>
 * Input: "25525511135"
 * Output: ["255.255.11.135", "255.255.111.35"]
 */
public class RestoreIP {
    public List<String> restoreIpAddresses(String s) {
        List<String> combs = new ArrayList<>();
        helper(combs, "", s, 0, 0);
        return combs;
    }

    public void helper(List<String> combs, String comb, String s, int start, int n) {
        if (n == 4) {
            combs.add(comb);
            return;
        }

        for (int j = 1; j <= 3; j++) {
            if (start + j >= s.length() + 1) break;
            int end = n == 3 ? s.length() : start + j;

            String sub = s.substring(start, end);
            if (sub.length() > 3
                    || Integer.valueOf(sub) > 255
                    || (sub.startsWith("0") && sub.length() > 1)) continue;

            if (n == 0)
                helper(combs, sub, s, start + j, n + 1);
            else
                helper(combs, comb + "." + sub, s, start + j, n + 1);

            if (n == 3) {
                break;
            }
        }
    }
}
