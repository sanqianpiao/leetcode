package dailycodingproblem;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PhoneNumberTest {

    PhoneNumber inst = new PhoneNumber();

    @Test
    public void combination() {
        List<String> combination = inst.combination("23");
        System.out.println(combination);
        assertEquals(9, combination.size());
    }

    @Test
    public void combination2() {
        List<String> combination = inst.combination("234");
        System.out.println(combination);
        assertEquals(27, combination.size());
    }
}