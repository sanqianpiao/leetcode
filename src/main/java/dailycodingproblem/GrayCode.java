package dailycodingproblem;

import java.util.ArrayList;
import java.util.List;

/**
 * Gray code is a binary code where each successive value differ in only one bit, as well as when wrapping around.
 * Gray code is common in hardware so that we don't see temporary spurious values during transitions.
 * <p>
 * Given a number of bits n, generate a possible gray code for it.
 * <p>
 * For example, for n = 2, one gray code would be [00, 01, 11, 10].
 */
public class GrayCode {

    public static List<String> graycode(int bits) {
        int n = 0, largest = (int) Math.pow(2, bits) - 1, // Assuming that bits == 4, 1111
                boundary = (int) Math.pow(2, bits), // 10000
                mostRight = boundary >> 1;// 1000

        List<String> list = new ArrayList<>();
        list.add(Integer.toBinaryString(boundary | n).substring(1));

        while (n < largest) {
            n <<= 1;
            n |= 1;
            list.add(Integer.toBinaryString(boundary | n).substring(1));
        }

        while (n > mostRight) {
            n <<= 1;
            n &= largest;
            list.add(Integer.toBinaryString(boundary | n).substring(1));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(1 << 1));
        System.out.println(Integer.toBinaryString(1 << 1 | 1));
        System.out.println(Integer.toBinaryString((int) Math.pow(2, 3) - 1));

        System.out.println(graycode(3));
        System.out.println(graycode(8));
    }
}
