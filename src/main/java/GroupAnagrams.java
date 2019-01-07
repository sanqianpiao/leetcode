import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> combs = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String sort = sort(str);
            map.compute(sort, (k, v) -> v == null ? new ArrayList<>() : v);
            map.get(sort).add(str);
        }

        for (List<String> list : map.values()) {
            combs.add(list);
        }

        return combs;
    }

    public String sort(String s) {
        char[] chs = s.toCharArray();
        Arrays.sort(chs);
        return new String(chs);
    }
}
