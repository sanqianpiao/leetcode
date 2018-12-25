public class MergeKSortedLinkedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        if(lists.length == 1) return lists[0];

        return merge(lists[0], lists, 1);
    }

    private ListNode merge(ListNode merged, ListNode[] lists, int index) {
        if(index == lists.length) return merged;
        ListNode newlist = merge2(merged, lists[index]);
        return merge(newlist, lists, index + 1);
    }

    private ListNode merge2(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null || l2 == null) {
            if(l1 != null) return l1;
            if(l2 != null) return l2;
        }

        ListNode newlist = null, p = null;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                if(p == null) p = l1;
                else {
                    p.next = l1;
                    p = p.next;
                }
                l1 = l1.next;
            } else {
                if(p == null) p = l2;
                else {
                    p.next = l2;
                    p = p.next;
                }
                l2 = l2.next;
            }

            if(newlist == null) newlist = p;
        }

        if(l1 != null) p.next = l1;
        if(l2 != null) p.next = l2;
        return newlist;
    }
}
