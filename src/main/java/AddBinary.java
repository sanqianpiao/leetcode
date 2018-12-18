/**
 * https://leetcode.com/problems/add-binary
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int alen = a.length() - 1, blen = b.length() - 1;
        int add = 0;
        for (; alen > -1 && blen > -1; alen--, blen--) {
            int v1 = a.charAt(alen) - '0', v2 = b.charAt(blen) - '0';
            int sum = v1 + v2 + add;
            int v = sum % 2;
            add = sum / 2;
            sb.append(v);
        }

        add = addRemaining(a, sb, alen, add);
        add = addRemaining(b, sb, blen, add);

        if (add > 0) {
            sb.append(add);
        }

        return sb.reverse().toString();
    }

    private int addRemaining(String s, StringBuilder sb, int index, int add) {
        while (index > -1) {
            int sum = (s.charAt(index) - '0') + add;
            int v = sum % 2;
            add = sum / 2;
            sb.append(v);
            index--;
        }
        return add;
    }

}
