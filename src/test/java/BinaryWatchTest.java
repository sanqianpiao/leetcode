import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import static org.junit.Assert.*;

public class BinaryWatchTest {

    private BinaryWatch watch;

    @Before
    public void setUp() {
        watch = new BinaryWatch();
    }

    @Test
    public void test0() {
        List<String> strings = watch.readBinaryWatch(0);

        System.out.println(strings);
    }

    @Test
    public void test1() {
        List<String> strings = watch.readBinaryWatch(1);

        System.out.println(strings);
    }

    @Test
    public void test2() {
        List<String> strings = watch.readBinaryWatch(2);
        String[] expect = {"0:03", "0:05", "0:06", "0:09", "0:10", "0:12", "0:17", "0:18", "0:20", "0:24", "0:33", "0:34", "0:36", "0:40", "0:48", "1:01", "1:02", "1:04", "1:08", "1:16", "1:32", "2:01", "2:02", "2:04", "2:08", "2:16", "2:32", "3:00", "4:01", "4:02", "4:04", "4:08", "4:16", "4:32", "5:00", "6:00", "8:01", "8:02", "8:04", "8:08", "8:16", "8:32", "9:00", "10:00"};
        String[] result = strings.toArray(new String[]{});
        assertArrayEquals("", expect, result);
        System.out.println(strings);
    }

    @Test
    public void test3() {
        List<String> strings = watch.readBinaryWatch(3);

        System.out.println(strings);
    }

    @Test
    public void test4() {
        List<String> strings = watch.readBinaryWatch(4);
        String[] expect = {"0:15", "0:23", "0:27", "0:29", "0:30", "0:39", "0:43", "0:45", "0:46", "0:51", "0:53", "0:54", "0:57", "0:58", "1:07", "1:11", "1:13", "1:14", "1:19", "1:21", "1:22", "1:25", "1:26", "1:28", "1:35", "1:37", "1:38", "1:41", "1:42", "1:44", "1:49", "1:50", "1:52", "1:56", "2:07", "2:11", "2:13", "2:14", "2:19", "2:21", "2:22", "2:25", "2:26", "2:28", "2:35", "2:37", "2:38", "2:41", "2:42", "2:44", "2:49", "2:50", "2:52", "2:56", "3:03", "3:05", "3:06", "3:09", "3:10", "3:12", "3:17", "3:18", "3:20", "3:24", "3:33", "3:34", "3:36", "3:40", "3:48", "4:07", "4:11", "4:13", "4:14", "4:19", "4:21", "4:22", "4:25", "4:26", "4:28", "4:35", "4:37", "4:38", "4:41", "4:42", "4:44", "4:49", "4:50", "4:52", "4:56", "5:03", "5:05", "5:06", "5:09", "5:10", "5:12", "5:17", "5:18", "5:20", "5:24", "5:33", "5:34", "5:36", "5:40", "5:48", "6:03", "6:05", "6:06", "6:09", "6:10", "6:12", "6:17", "6:18", "6:20", "6:24", "6:33", "6:34", "6:36", "6:40", "6:48", "7:01", "7:02", "7:04", "7:08", "7:16", "7:32", "8:07", "8:11", "8:13", "8:14", "8:19", "8:21", "8:22", "8:25", "8:26", "8:28", "8:35", "8:37", "8:38", "8:41", "8:42", "8:44", "8:49", "8:50", "8:52", "8:56", "9:03", "9:05", "9:06", "9:09", "9:10", "9:12", "9:17", "9:18", "9:20", "9:24", "9:33", "9:34", "9:36", "9:40", "9:48", "10:03", "10:05", "10:06", "10:09", "10:10", "10:12", "10:17", "10:18", "10:20", "10:24", "10:33", "10:34", "10:36", "10:40", "10:48", "11:01", "11:02", "11:04", "11:08", "11:16", "11:32"};
        String[] result = strings.toArray(new String[]{});
        assertArrayEquals("", expect, result);
        System.out.println(strings);
    }

    @Test
    public void test6() {
        List<String> strings = watch.readBinaryWatch(6);
        String[] expect = {"1:31", "1:47", "1:55", "1:59", "2:31", "2:47", "2:55", "2:59", "3:15", "3:23", "3:27", "3:29", "3:30", "3:39", "3:43", "3:45", "3:46", "3:51", "3:53", "3:54", "3:57", "3:58", "4:31", "4:47", "4:55", "4:59", "5:15", "5:23", "5:27", "5:29", "5:30", "5:39", "5:43", "5:45", "5:46", "5:51", "5:53", "5:54", "5:57", "5:58", "6:15", "6:23", "6:27", "6:29", "6:30", "6:39", "6:43", "6:45", "6:46", "6:51", "6:53", "6:54", "6:57", "6:58", "7:07", "7:11", "7:13", "7:14", "7:19", "7:21", "7:22", "7:25", "7:26", "7:28", "7:35", "7:37", "7:38", "7:41", "7:42", "7:44", "7:49", "7:50", "7:52", "7:56", "8:31", "8:47", "8:55", "8:59", "9:15", "9:23", "9:27", "9:29", "9:30", "9:39", "9:43", "9:45", "9:46", "9:51", "9:53", "9:54", "9:57", "9:58", "10:15", "10:23", "10:27", "10:29", "10:30", "10:39", "10:43", "10:45", "10:46", "10:51", "10:53", "10:54", "10:57", "10:58", "11:07", "11:11", "11:13", "11:14", "11:19", "11:21", "11:22", "11:25", "11:26", "11:28", "11:35", "11:37", "11:38", "11:41", "11:42", "11:44", "11:49", "11:50", "11:52", "11:56"};
        String[] result = strings.toArray(new String[]{});

        System.out.println(Arrays.toString(result));

        strings.removeAll(new ArrayList<>(Arrays.asList(expect)));
        System.out.println("diff: " + strings.toString());
        assertArrayEquals("", expect, result);
    }

    @Test
    public void test9() {
        List<String> strings = watch.readBinaryWatch(9);

        System.out.println(strings);
    }
}