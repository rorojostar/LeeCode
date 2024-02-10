package com.rongwen.top100.link;

import com.rongwen.top100.link.node.ListNode;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0), cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2;
        return head.next;
    }
}
