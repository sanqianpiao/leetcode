package others;

import java.util.*;

public class Groups {
    public List<List<Character>> group(char[] a) {
        Map<Character, Integer> map = new HashMap<>();
        List<List<Character>> groups = new ArrayList<>();

        for (char ch : a) {
            map.compute(ch, (k, v) -> {
                if (v == null) return 1;
                else return v + 1;
            });
        }

        while(map.size() > 0) {
            List<Character> g = new ArrayList<>();
            Iterator<Character> iterator = map.keySet().iterator();
            while(iterator.hasNext()) {
                Character key = iterator.next();
                g.add(key);
                int n = map.get(key) - 1;
                if(n == 0) iterator.remove();
                else map.put(key, n);
            }
            groups.add(g);
        }

        return groups;
    }
}
