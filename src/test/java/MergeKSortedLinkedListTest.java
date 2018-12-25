import org.junit.Test;

import static org.junit.Assert.*;

public class MergeKSortedLinkedListTest {

    MergeKSortedLinkedList inst = new MergeKSortedLinkedList();

    @Test
    public void mergeKLists() {
        ListNode l1 = ListNode.fromArray(new int[]{1});
        ListNode l2 = ListNode.fromArray(new int[]{1});

        ListNode listNode = inst.mergeKLists(new ListNode[]{l1, l2});
    }
}