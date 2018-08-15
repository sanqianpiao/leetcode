import org.junit.Test;

import static org.junit.Assert.*;

public class PushDominoesTest {

    PushDominoes p = new PushDominoes();

    @Test
    public void segment1() {
        String result = p.segment(new StringBuffer("R.....L"));
        String expect = "RRR.LLL";
        assertEquals(expect, result);
    }

    @Test
    public void segment2() {
        String result = p.segment(new StringBuffer("R......"));
        String expect = "RRRRRRR";
        assertEquals(expect, result);
    }

    @Test
    public void segment3() {
        String result = p.segment(new StringBuffer("R.....R"));
        String expect = "RRRRRRR";
        assertEquals(expect, result);
    }

    @Test
    public void segment4() {
        String result = p.segment(new StringBuffer("L.....L"));
        String expect = "LLLLLLL";
        assertEquals(expect, result);
    }

    @Test
    public void segment5() {
        String result = p.segment(new StringBuffer("L.....R"));
        String expect = "L.....R";
        assertEquals(expect, result);
    }

    @Test
    public void segment6() {
        String result = p.segment(new StringBuffer("L......"));
        String expect = "L......";
        assertEquals(expect, result);
    }

    @Test
    public void segment7() {
        String result = p.segment(new StringBuffer("......."));
        String expect = ".......";
        assertEquals(expect, result);
    }

    @Test
    public void segment8() {
        String result = p.segment(new StringBuffer("......R"));
        String expect = "......R";
        assertEquals(expect, result);
    }

    @Test
    public void segment9() {
        String result = p.segment(new StringBuffer("......L"));
        String expect = "LLLLLLL";
        assertEquals(expect, result);
    }


    @Test
    public void pushDominoes() {
        String input = "RR.L";
        String expect = "RR.L";

        String result = p.pushDominoes(input);
        System.out.println(result);
        assertEquals(expect, result);
    }

    @Test
    public void test1() {
        String input  = ".L.R...LR..L..";
        String expect = "LL.RR.LLRRLL..";
        String result = p.pushDominoes(input);
        System.out.println(result);
        assertEquals(expect, result);
    }

    @Test
    public void test2() {
        String input  = "RL";
        String expect = "RL";
        String result = p.pushDominoes(input);
        System.out.println(result);
        assertEquals(expect, result);
    }

    @Test
    public void test3() {
        String input  = "..R..";
        String expect = "..RRR";
        String result = p.pushDominoes(input);
        System.out.println(result);
        assertEquals(expect, result);
    }

    @Test
    public void test4() {
        String input  = "RRRL...";
        String expect = "RRRL...";
        String result = p.pushDominoes(input);
        System.out.println(result);
        assertEquals(expect, result);
    }

    @Test
    public void test5() {
        String input  = ".L.R.";
        String expect = "LL.RR";
        String result = p.pushDominoes(input);
        System.out.println(result);
        assertEquals(expect, result);
    }

    @Test
    public void test6() {
        String input  = "R.R.L";
        String expect = "RRR.L";
        String result = p.pushDominoes(input);
        System.out.println(result);
        assertEquals(expect, result);
    }

    @Test
    public void test7() {
        String input  = "RRRRRRL...";
        String expect = "RRRRRRL...";
        String result = p.pushDominoes(input);
        System.out.println(result);
        assertEquals(expect, result);
    }




}