import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SummaryRangesTest {

    SummaryRanges inst = new SummaryRanges();

    @Test
    public void summaryRanges() {
        int[] a = {0, 1, 2, 4, 5, 7};
        List<String> strings = inst.summaryRanges(a);
        System.out.println(strings);
        assertEquals(3, strings.size());
    }

    @Test
    public void summaryRanges2() {
        int[] a = {0, 2, 3, 4, 6, 8, 9};
        List<String> strings = inst.summaryRanges(a);
        System.out.println(strings);
        assertEquals(4, strings.size());
    }

    @Test
    public void summaryRanges3() {
        int[] a = {0};
        List<String> strings = inst.summaryRanges(a);
        System.out.println(strings);
        assertEquals(1, strings.size());
    }


}