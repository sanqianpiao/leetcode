import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ExpressionAddOperatorsTest {

    ExpressionAddOperators inst = new ExpressionAddOperators();

    @Test
    public void addOperators() {
        List<String> strings = inst.addOperators("123", 6);
        System.out.println(strings);
        assertEquals(2, strings.size());
    }

    @Test
    public void addOperators2() {
        List<String> strings = inst.addOperators("105", 5);
        System.out.println(strings);
        assertEquals(2, strings.size());
    }

    @Test
    public void operatorHelper() {
        List<String> combs = new ArrayList<>();
        char[] signs = {'+', '-', '*', '/'};
        List<String> nums = Arrays.asList("123");
        inst.operatorHelper(combs, "", nums, 0, signs);
        System.out.println(combs);
        assertEquals(1, combs.size());
    }

    @Test
    public void operatorHelper2() {
        List<String> combs = new ArrayList<>();
        char[] signs = {'+', '-', '*', '/'};
        List<String> nums = Arrays.asList("1", "0", "5");
        inst.operatorHelper(combs, "", nums, 0, signs);
        System.out.println(combs);
    }
}