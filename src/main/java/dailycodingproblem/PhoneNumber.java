package dailycodingproblem;

import java.util.*;

public class PhoneNumber {
    Map<String, List<Character>> keymap;

    public PhoneNumber() {
        keymap = new HashMap<>();
        keymap.put("2", Arrays.asList('a', 'b', 'c'));
        keymap.put("3", Arrays.asList('d', 'e', 'f'));
        keymap.put("4", Arrays.asList('g', 'h', 'i'));
    }

    List<String> combination(String keys) {
        List<List<Character>> lists = new ArrayList<>();
        for (int i = 0; i < keys.length(); i++) {
            lists.add(keymap.get(keys.substring(i, i + 1)));
        }

        List<String> combs = new ArrayList<>();

        helper(combs, "", lists, 0);
        return combs;
    }

    void helper(List<String> combs, String comb, List<List<Character>> lists, int row) {
        if (comb.length() == lists.size()) {
            combs.add(comb);
            return;
        }
        List<Character> chs = lists.get(row);

        for (int i = 0; i < chs.size(); i++) {
            helper(combs, comb + chs.get(i), lists, row + 1);
        }
    }
}
