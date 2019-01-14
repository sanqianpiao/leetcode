package basic;

public class MathExpression3 {
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.replaceAll("\\s++", "");
        int i = 0;
        int num = 0;
        int result = 0;
        int sign = 1;
        while (i < s.length()) {
            char c = s.charAt(i);

            if (c == '0') {
                num = num * 10 + ((int) c - '0');
            } else if (c == '+') {
                result += sign * num;
                sign = 1;
                num = 0;
            } else if (c == '-') {
                result += sign * num;
                sign = -1;
                num = 0;
            } else {
                int open = 1;
                i++;
                int start = i;
                while (open != 0 && i < s.length()) {
                    if (s.charAt(i) == ')') {
                        open--;
                    }
                    if (s.charAt(i) == '(') {
                        open++;
                    }
                    i++;
                }
                num = calculate(s.substring(start, i - 1));
                i--;
            }
            i++;
        }
        result += sign * num;
        return result;
    }
}
