package gfg;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ValidIPAddressesTest {

    ValidIPAddresses inst = new ValidIPAddresses();

    @Test
    public void valid() {
        List<String> valid = inst.valid("123405678");
        System.out.println(valid);
    }

    @Test
    public void name() {
        List<String> valid = inst.valid("25525511135");
        System.out.println(valid);

    }
}