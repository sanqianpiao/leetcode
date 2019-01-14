package basic;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MathExpressionTest {

    MathExpression inst = new MathExpression();

    @Test
    public void sum() {
        assertEquals(2, inst.calculate("6+9-13"));
        assertEquals(255, inst.calculate("255"));

        assertEquals(23, inst.calculate("(1+(4+5+2)-3)+(6+8)"));
        assertEquals(255, inst.calculate("((255))"));
        assertEquals(11, inst.calculate("(7)-(0)+(4)"));
        assertEquals(3, inst.calculate("2-(5-6)"));
    }
}