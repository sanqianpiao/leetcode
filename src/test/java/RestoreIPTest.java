import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RestoreIPTest {

    RestoreIP inst = new RestoreIP();

    @Test
    public void restoreIpAddresses() {
        List<String> ips = inst.restoreIpAddresses("0000");
        System.out.println(ips);
        assertEquals(1, ips.size());
    }

    @Test
    public void restoreIpAddresses2() {
        List<String> ips = inst.restoreIpAddresses("010010");
        System.out.println(ips);
        assertEquals(2, ips.size());
    }
}