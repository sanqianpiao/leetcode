/**
 * Complete the function that takes an integer as its argument and returns the encoded string in base 7 using the following encoding rule:
 * base 10 0 1 2 3 4 5 6
 * base 7 0 a t l s i N
 * <p>
 * Sample Input 1
 * 7
 * <p>
 * Sample Output 1
 * a0
 */
public class DecimalToBase7 {

    char[] code = {'0', 'a', 't', 'l', 's', 'i', 'n'};

    public String convert(int decimal) {
        int convert = convert(decimal, 7);
        if (convert == 0) return "0";

        StringBuilder sb = new StringBuilder();
        while (convert != 0) {
            sb.append(code[convert % 10]);
            convert /= 10;
        }

        return sb.reverse().toString();
    }

    public int convert(int decimal, int base) {
        if (base >= 10)
            throw new IllegalArgumentException("base must be less or equals to 10");

        int num = 0, len = 0;
        while (decimal != 0) {
            int r = decimal % base;
            num += Math.pow(10, len++) * r;
            decimal /= base;
        }
        return num;
    }
}
