package com.rongwen.top100.link;

import com.rongwen.top100.link.node.ListNode;

public class DetectCycle {
    /**
     * 142. 环形链表 II
     * 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
     *
     * @param head
     * @return
     */

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;

    }
}
