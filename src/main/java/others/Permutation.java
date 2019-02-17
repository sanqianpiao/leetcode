package others;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public void p(char[] a) {
        helper(a, new ArrayList<>());
    }

    public void helper(char[] a, List<Character> p) {
        if(p.size() == a.length) {
            System.out.println(p);
            return;
        }
        for(int i = 0; i < a.length; i++) {
            if(p.contains(a[i])) continue;
            p.add(a[i]);
            helper(a, p);
            p.remove(p.size() - 1);
        }
    }

    public static void main(String[] args) {
        new Permutation().p(new char[]{'A', 'B', 'C'});
    }
}
