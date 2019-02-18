import java.util.HashMap;
import java.util.Map;

/**
 * TinyURL is a URL shortening service where you enter a URL such as
 * https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.
 * <p>
 * Design the encode and decode methods for the TinyURL service.
 * There is no restriction on how your encode/decode algorithm should work.
 * You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 */
public class Codec {

    private long seq = 0;
    private Map<Long, String> urls = new HashMap<>();
    private final String prefix = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        seq++;
        urls.put(seq, longUrl);
        return prefix + toBase62(seq);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int i = shortUrl.lastIndexOf("/");
        if (i == -1) throw new IllegalArgumentException();
        return urls.get(toLong(shortUrl.substring(i + 1)));
    }

    private final String ch = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final Map<Character, Integer> code;

    public Codec() {
        code = new HashMap<>();
        for (int i = 0; i < ch.length(); i++) code.put(ch.charAt(i), i);
    }

    public String toBase62(long seq) {
        StringBuilder sb = new StringBuilder();
        while (seq > 0) {
            sb.append(ch.charAt((int) seq % ch.length()));
            seq /= ch.length();
        }
        return sb.reverse().toString();
    }

    public long toLong(String base62) {
        long i = 0L;
        for (char c : base62.toCharArray()) {
            i = i * ch.length() + code.get(c);
        }
        return i;
    }
}
