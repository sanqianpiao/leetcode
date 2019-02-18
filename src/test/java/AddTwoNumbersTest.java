import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    AddTwoNumbers inst = new AddTwoNumbers();

    @Test
    public void addTwoNumbers() {
        ListNode l1 = ListNode.fromArray(new int[]{2, 4, 3});
        ListNode l2 = ListNode.fromArray(new int[]{5, 6, 4});
        ListNode listNode = inst.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{7, 0, 8}, ListNode.toArray(listNode));
    }

    @Test
    public void addTwoNumbers2() {
        ListNode l1 = ListNode.fromArray(new int[]{5});
        ListNode l2 = ListNode.fromArray(new int[]{5});
        ListNode listNode = inst.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 1}, ListNode.toArray(listNode));
    }

    @Test
    public void addTwoNumbers3() {
        ListNode l1 = ListNode.fromArray(new int[]{5, 5, 5});
        ListNode l2 = ListNode.fromArray(new int[]{});
        ListNode listNode = inst.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{5, 5, 5}, ListNode.toArray(listNode));
    }

    @Test
    public void addTwoNumbers4() {
        ListNode l1 = ListNode.fromArray(new int[]{5, 5, 5});
        ListNode l2 = ListNode.fromArray(new int[]{5});
        ListNode listNode = inst.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 6, 5}, ListNode.toArray(listNode));
    }
}