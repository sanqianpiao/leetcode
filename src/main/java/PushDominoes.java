public class PushDominoes {

    public String pushDominoes(String dominoes) {
        char[] chars = dominoes.toCharArray();
        StringBuffer s = new StringBuffer();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
            if (sb.length() == 1 && i != chars.length - 1) {
                continue;
            }

            if (sb.charAt(0) == chars[i] && chars[i] != '.' && sb.indexOf(".") < 0) {
                s.append(sb.toString());
                sb.delete(0, sb.length());
                continue;
            }

            if (i == chars.length - 1
                    || (sb.charAt(0) == '.' && chars[i] == 'L')
                    || (sb.charAt(0) == '.' && chars[i] == 'R')) {
                if (s.length() > 0 && sb.charAt(0) == '.') {
                    sb.insert(0, s.charAt(s.length() - 1));
                    s.deleteCharAt(s.length() - 1);
                }
                s.append(segment(sb));
                sb = sb.delete(0, sb.length());
                continue;
            }

            if ((sb.charAt(0) == 'R' && chars[i] == 'L')
                    || (sb.charAt(0) == 'R' && chars[i] == 'R')) {
                s.append(segment(sb));
                sb = sb.delete(0, sb.length());
                continue;
            }

            if ((sb.charAt(0) == 'L' && chars[i] == 'L')
                    || (sb.charAt(0) == 'L' && chars[i] == 'R')) {
                s.append(segment(sb));
                sb = sb.delete(0, sb.length());
                continue;
            }

        }

        return s.toString();
    }

    StringBuffer replaceChar(StringBuffer sb, int start, int end, char ch) {
        for (int i = start; i < end; i++) {
            sb.setCharAt(i, ch);
        }
        return sb;
    }

    String segment(StringBuffer sb) {
        int len = sb.length();

        if (sb.charAt(0) == '.' && sb.charAt(len - 1) == 'L') {
            replaceChar(sb, 0, len - 1, 'L');
            return sb.toString();
        }

        if (sb.charAt(0) == '.' && sb.charAt(len - 1) == '.') {
            return sb.toString();
        }

        if (sb.charAt(0) == '.' && sb.charAt(len - 1) == 'R') {
            return sb.toString();
        }

        //R
        if (sb.charAt(0) == 'R' && sb.charAt(len - 1) == 'L') {
            replaceChar(sb, 0, len / 2, 'R');
            replaceChar(sb, len % 2 == 0 ? len / 2 : len / 2 + 1, len, 'L');
            return sb.toString();
        }

        if (sb.charAt(0) == 'R' && sb.charAt(len - 1) == '.') {
            replaceChar(sb, 0, len, 'R');
            return sb.toString();
        }

        if (sb.charAt(0) == 'R' && sb.charAt(len - 1) == 'R') {
            replaceChar(sb, 0, len, 'R');
            return sb.toString();
        }

        //L
        if (sb.charAt(0) == 'L' && sb.charAt(len - 1) == 'L') {
            replaceChar(sb, 0, len - 1, 'L');
            return sb.toString();
        }

        if (sb.charAt(0) == 'L' && sb.charAt(len - 1) == '.') {
            return sb.toString();
        }

        if (sb.charAt(0) == 'L' && sb.charAt(len - 1) == 'R') {
            return sb.toString();
        }

        return sb.toString();

    }
}
