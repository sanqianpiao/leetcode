package gfg;

import java.util.ArrayList;
import java.util.List;

/**
 * 123405678
 * <p>
 * Given a string of integers ex:123405678 find all the valid IPV4 addresses that can be formed from the string given
 * that you always start from the starting index i.e all IP address should start with index 0 in this case 1.
 */
public class ValidIPAddresses {

    public List<String> valid(String s) {
        List<String> combs = new ArrayList<>();
        helper(combs, "", 1, 0, s);
        return combs;
    }

    public void helper(List<String> combs, String comb, int seq, int startIndex, String s) {
        if (seq == 5) {
            combs.add(comb);
            return;
        }

        int i = startIndex + 1;
        if (seq == 4) i = s.length();
        for (; i < startIndex + 4 && i <= s.length(); i++) {
            //check the remaining length
            if (seq < 4 && s.length() - i > 12 - 3 * seq) continue;

            String part = s.substring(startIndex, i);

            if (part.startsWith("0") && part.length() > 1) continue;
            if (Integer.valueOf(part) > 255) return;

            helper(combs, comb.length() == 0 ? part : comb + "." + part, seq + 1, i, s);
        }
    }
}
