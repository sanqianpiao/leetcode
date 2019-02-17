/**
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newlist = new ListNode(0);
        ListNode l3 = newlist;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            l3.next = new ListNode(sum % 10);
            carry = sum / 10;

            l1 = (l1 == null ? null : l1.next);
            l2 = (l2 == null ? null : l2.next);
            l3 = l3.next;
        }

        return newlist.next;
    }
}
