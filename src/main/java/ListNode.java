import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode fromArray(int[] a) {
        ListNode head = null, p = null;
        for (int num : a) {
            if (p == null) p = new ListNode(num);
            else {
                p.next = new ListNode(num);
                p = p.next;
            }
            if (head == null) head = p;
        }
        return head;
    }

    public static int[] toArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}