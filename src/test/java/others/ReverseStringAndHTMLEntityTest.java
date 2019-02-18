package others;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * "1234&euro;"	=>	"&euro;4321"
 * "1234&euro"	=>	"orue&4321"
 * "1234&euro;567"	=>	"765&euro;4321"
 * "aaa;aaa&amp;bbb;;;" => ";;;bbb&amp;aaa;aaa"
 */
public class ReverseStringAndHTMLEntityTest {

    ReverseStringAndHTMLEntity inst = new ReverseStringAndHTMLEntity();

    @Test
    public void reverse() {
        assertEquals("&euro;4321", inst.reverse("1234&euro;"));
        assertEquals("orue&4321", inst.reverse("1234&euro"));
        assertEquals("765&euro;4321", inst.reverse("1234&euro;567"));
        assertEquals(";;;bbb&amp;aaa;aaa", inst.reverse("aaa;aaa&amp;bbb;;;"));
    }
}